package com.masterjava.service;

import java.util.List;

import com.masterjava.modelo.Pagina;
import com.masterjava.modelo.Tematica;

public class ValidationService {

	private List<Pagina> listaPaginasStreamingMusica = List.of(

			new Pagina("Spotify", "https://open.spotify.com/intl-es",
					"Spotify es un servicio de música digital que te brinda acceso a millones de canciones.",
					"Streaming Musica"),
			new Pagina("Apple Music", "https://music.apple.com/es/new",
					"Reproduce millones de canciones en audio espacial con Apple Music. Disponible con y sin conexión, y ni un solo anuncio.",
					"Streaming Musica"),
			new Pagina("Amazon Music", "https://music.amazon.es",
					"Ahora puedes explorar y escuchar tu música, podcasts y playlists favoritos desde tu navegador web. Disfruta de más de 100 millones de canciones en Amazon Music.",
					"Streaming Musica"));

	private List<Pagina> listaPaginasServicioStreaming = List.of(

			new Pagina("Netflix", "https://www.netflix.com/es/",
					"¿Qué es Netflix? Netflix es un servicio de streaming que ofrece una amplia variedad de series, películas, títulos de anime, documentales y otros contenidos.",
					"Servicios Streaming"),
			new Pagina("HBO Max", "https://www.max.com/es/es",
					"Max es un servicio de streaming propiedad de Warner Bros.", "Servicios Streaming"),
			new Pagina("Filmin", "https://www.filmin.es/?utm_medium=webedia",
					"Filmin, cine, series y cortos online en alta definición.", "Servicios Streaming"));

	private List<Pagina> listaPaginasServicioCompra = List.of(

			new Pagina("Amazon", "https://www.amazon.es/",
					"Descubre y compra online: electrónica, moda, hogar, libros, deporte y mucho más a precios bajos en Amazon.es.",
					"Servicios Compra"),
			new Pagina("AliExpress", "https://es.aliexpress.com/",
					"Compra online de electrónica, moda, accesorios para móviles, informática, infantil y más artículos que son tendencia en AliExpress.",
					"Servicios Compra"),
			new Pagina("Temu", "https://www.temu.com/es",
					"Haga de Temu su destino único para los últimos productos de moda, cosméticos y más.",
					"Servicios Compra"));

	private List<Tematica> listaTematicas = List.of(

			new Tematica("Streaming Musica", listaPaginasStreamingMusica),
			new Tematica("Servicios Streaming", listaPaginasServicioStreaming),
			new Tematica("Servicios Compra", listaPaginasServicioCompra)

	);

	public Tematica validarTematica(String nombre) {

		return listaTematicas.stream().filter(x -> x.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);

	}

	public List<Tematica> getListaTematicas() {

		return listaTematicas;
	}

}
