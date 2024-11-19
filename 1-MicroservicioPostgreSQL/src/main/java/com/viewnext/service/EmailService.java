package com.viewnext.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viewnext.model.AnimalPedido;
import com.viewnext.model.Cliente;
import com.viewnext.model.Pedido;
import com.viewnext.repository.IClienteRepo;
import com.viewnext.repository.IPedidoRepo;

@Service
public class EmailService {

	private String correo = "micorreo";

	private String pass = "pass";

	@Autowired
	IClienteRepo clienteRepository;

	@Autowired
	IPedidoRepo pedidoRepository;

	public void enviarCorreo(AnimalPedido animalPedido) throws MessagingException {
		Pedido pedido = pedidoRepository.findById(animalPedido.getPedido().getIdPedido()).orElse(null);
		Cliente cliente = clienteRepository.findById(pedido.getIdCliente()).orElse(null);
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");

		Session sesion = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(correo, pass);
			}
		});

		Message mensaje = new MimeMessage(sesion);
		mensaje.setFrom(new InternetAddress(correo));
		mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(cliente.getEmail()));
		mensaje.setSubject("Confirmación de su pedido en Patitas&Co");
		mensaje.setText("Estimado " + cliente.getNombre() + ",\n\n"
				+ "Se ha realizado un pedido en Patitas&Co con los siguientes detalles:\n\n" + "ID Pedido: "
				+ pedido.getIdPedido() + "\n" + "Fecha: " + pedido.getFechaPedido() + "\n" + "Precio: "
				+ pedido.getPrecioTotal() + "€" + "\n\n" + "Atentamente,\n" + "Patitas&Co");

		Transport.send(mensaje);

	}

}
