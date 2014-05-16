package reboucas.marcelo.webservice.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import javax.ws.rs.core.UriBuilder;

import reboucas.marcelo.webservice.bean.Pessoa;

import com.google.gson.Gson;

/**
 * @author Marcelo Rebouças [marceloreboucas10@gmail.com]
 * @date 15/05/2014 20:34:42
 */
public class PrimeiroWebServiceRestClient {
	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://localhost:8080/webservicerest/rest/ws");
		
		//HttpURLConnection urlPage = (HttpURLConnection) url.openConnection();
		URLConnection urlPage = url.openConnection();
		urlPage.connect();
		InputStreamReader in = new InputStreamReader((InputStream) urlPage.getContent());
		BufferedReader buffer = new BufferedReader(in);
		StringBuilder json = new StringBuilder();
		String linha;
		while ((linha = buffer.readLine()) != null) {
			 json.append(linha);
		 }
		
		Pessoa pessoa = new Gson().fromJson(json.toString(), Pessoa.class);
		
/*		
 * 
		System.out.println("Resultado da requisição é: " + json);
		
		ClientConfig config = new DefaultClientConfig();
	    Client client = Client.create(config);
	    WebResource service = client.resource(getURI());
	    
	    System.out.println(service.getProperties());
	    
	    // Fluent interfaces
	    System.out.println(service.path("rest").path("ws").accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
	    
	    // Get json
	    System.out.println(service.path("rest").path("ws").accept(MediaType.TEXT_PLAIN).get(String.class));*/
	    
	    /*// Get plain text
	    System.out.println(service.path("rest").path("ws").accept(MediaType.TEXT_PLAIN).get(String.class));
	    // Get XML
	    System.out.println(service.path("rest").path("ws").accept(MediaType.TEXT_XML).get(String.class));
	    // The HTML
	    System.out.println(service.path("rest").path("ws").accept(MediaType.TEXT_HTML).get(String.class));*/
		
	}
	
	private static URI getURI() {
		return UriBuilder.fromUri("http://localhost:8080/webservicerest/rest/ws").build();
		
	}
}