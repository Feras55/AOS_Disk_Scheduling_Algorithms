import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class GraphDrawer extends JFrame {
    ArrayList<Integer> points;

    public void paint(Graphics g) { // draw the nodes and edges
        g.clearRect(0, 80, getWidth(), getHeight());
        drawGraph();
    }

    public void drawGraph() {


        this.getGraphics().drawLine(0, 70, 500, 70);
        int y = 150;
        int i,x = 15;
        int scale = 2;
        for (i = 0; i < points.size() - 1; ++i){

            this.getGraphics().fillOval(scale*(10+points.get(i))-5, y - 5, 10, 10);
            this.getGraphics().drawLine((int)scale*(10 + points.get(i)), y, (int)scale*(10 + points.get(i + 1)), y += 35);
        }
        y=150;
        Collections.sort(points);
        for (var point : points) {
            int lg =(int) Math.log10(point);
            this.getGraphics().drawLine(scale*(10 + point), 60, scale*(10 + point), 70);
            this.getGraphics().drawString(Integer.toString(point),scale*(10 + point)-lg*5,70+x);
            x*=-1;
            y+=35;
        }



    }

    public GraphDrawer(ArrayList<Integer> points) {
        this.points = points;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
/*
    public void paint2() { // draw the nodes and edges

            Graphics g =this.getGraphics();
            Color color = root.color == 1?Color.RED:Color.black;

            FontMetrics f = this.getGraphics().getFontMetrics();
            int nodeHeight = Math.max(height, f.getHeight());

            int nodeWidth = Math.max(width, f.stringWidth(String.valueOf(root.data))+width/2);
            g.setColor(Color.white);
            g.fillOval(Pa.first-nodeWidth/2, Pa.second-nodeHeight/2, nodeWidth, nodeHeight);
            g.setColor(color);
            g.drawOval(Pa.first-nodeWidth/2, Pa.second-nodeHeight/2, nodeWidth, nodeHeight);
            g.drawString(String.valueOf(root.data), Pa.first-f.stringWidth(String.valueOf(root.data))/2,
                    Pa.second+f.getHeight()/2);

            if(root.left!=null){
                paint2(root.left,new pair(Pa.first-space,Pa.second+50),space/2);
                this.getGraphics().drawLine(Pa.first, Pa.second,
                        Pa.first-space, Pa.second+50);
            }
            if(root.right!=null){
                paint2(root.right,new pair(Pa.first +space,Pa.second+50),space/2);
                this.getGraphics().drawLine(Pa.first, Pa.second,
                        Pa.first +space, Pa.second+50);
            }
        }
    }

    public TreeDraw() { //Constructor
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        width = 30;
        height = 30;
    }

    public TreeDraw(String name) { //Construct with label
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setName(name);
        this.setTitle(name);
        width = 30;
        height = 30;
        TNULL.color = 0;
        TNULL.left = null;
        TNULL.right = null;

    }
*/
}
