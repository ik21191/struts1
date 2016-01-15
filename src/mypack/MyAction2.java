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
public class MyAction2 extends org.apache.struts.action.Action 
{
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
        {
        	return mapping.findForward("imran");
        }
}
