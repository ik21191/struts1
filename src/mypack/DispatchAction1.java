/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.actions.DispatchAction;
public class DispatchAction1 extends DispatchAction {
	String prm;
	

    public String getPrm() {
		return prm;
	}
	public void setPrm(String prm) {
		this.prm = prm;
	}
	/* forward name="success" path="" */
    private final static String SUCCESS = "SUCCESS";
    //private final static String FAILURE = "failure";
    private static int count=0;
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public DispatchAction1() {
    	count++;
		System.out.println(count+" DispatchAction1 object is created.");
	}
    public ActionForward mymethod(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
        {
        	System.out.println("User defined method mymethod() is called.");
        	System.out.println(prm);
        	return mapping.findForward(SUCCESS);
        }
    /*public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
        {
        	System.out.println("execute() method of DispatchAction1");
        	System.out.println(prm);
        	return mapping.findForward(SUCCESS);//This method has more priority then other user defined method.
        }*/
}
