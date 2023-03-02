import java.awt.*;
import java.applet.*;
public class trafic extends Applet implements Runnable
{
Color c;
Thread t;
int i;
public void init()
{
t=new Thread(this);
t.start();
i=1;
}
public void run()
{
while(true)
{
if(i==1)
{
c=new Color(255,0,0);
i=2;
repaint();
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
}
}
if(i==2)
{
c=new Color(255,255,0);
i=3;
repaint();
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{
}
}
if(i==3)
{
c=new Color(0,255,0);
i=1;
repaint();
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
}
}
}
}
public void paint(Graphics g)
{
g.setColor(Color.black);
g.fillRect(90,90,120,320);
if(i==2)
{
g.setColor(c);
g.fillOval(100,100,100,100);
}
if(i==3)
{
g.setColor(c);
g.fillOval(100,200,100,100);
}
if(i==1)
{
g.setColor(c);
g.fillOval(100,300,100,100);
}
}
}
/*<html>
<applet code="trafic" height=700 width=700>
</applet>
</html>*/