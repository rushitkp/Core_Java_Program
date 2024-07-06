import java.applet.*;
import java.awt.*;
/* <applet code="PassParam.class" width=800 height=500>
    <param name="sub" value="JAVA Programming Language!">
    </applet>
 */
public class PassParam extends Applet
{
    String str;
    public void init()
    {
        str=getParameter("sub");
        if(str==null)
            str="Subject is not defined";
        else
            str="Subject="+str;    
    }
    public void pain(Graphics g)
    {
        g.drawString(str,10,100);
    }
}
