package project.bmicalc.resources;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import org.json.JSONObject;
import project.bmicalc.bmiutil.BMIUtils;

@Path("/bmiutil")
public class BmiCalcRes {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
        
    @GET
    @Produces({ MediaType.APPLICATION_JSON})
	public String getPhrases(
                @QueryParam("bmi") double bmi,
                @QueryParam("bmiold") double bmiold) {
            
            int change = 0;
            if(bmiold != 0){
                if(bmi > bmiold)
                    change = 1;
                else
                    change = 2;
            }
            
            int lvl = BMIUtils.getLevelByBmi(bmi);
            
            JSONObject jo = new JSONObject();
            
            jo.put("bmilvl", lvl);
            jo.put("change", change);
            
            return jo.toString();
	}
} 
