package portlets;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class PoblacionPortlet extends GenericPortlet{
	
	//el ciclo de vida de un portlet es igual que el ciclo de vida
	//de un servlet, por lo tanto la instacia de este portlet sera 
	//unica
	int contadorVisitasTotales = 0;
	
	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		System.out.println("Numero de visitas totales: "
				+ ++contadorVisitasTotales);
		PortletRequestDispatcher prd = getPortletContext()
				.getRequestDispatcher("/jsp/poblacion_view.jsp");
		prd.include(request, response);
	}
	
	@Override
	protected void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		PortletRequestDispatcher prd = getPortletContext()
				.getRequestDispatcher("/jsp/poblacion_edit.jsp");
		prd.include(request, response);
	}
	
	@Override
	protected void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		PortletRequestDispatcher prd = getPortletContext()
				.getRequestDispatcher("/jsp/poblacion_help.jsp");
		prd.include(request, response);
	}

}
