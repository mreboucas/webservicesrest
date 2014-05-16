package reboucas.marcelo.webservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import reboucas.marcelo.webservice.bean.Pessoa;

/**
 * @author Marcelo Rebouças [marceloreboucas10@gmail.com]
 * @date 15/05/2014 18:58:05
 */
@Path("/ws")
public class PrimeiroWebServiceRest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getJson() {
		
		return new Gson().toJson(getPessoaPreenchida()).toString();
		
	}
	
	private Pessoa getPessoaPreenchida() {
		return new Pessoa(96611952349L, "Marcelo", "Rebouças");
	}

}



























