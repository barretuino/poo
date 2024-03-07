// MouseDetails.java
// Demonstrando cliques do mouse e
// distinguindo os botões do mouse.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDetails extends JFrame {
   private int xPos, yPos;

   // configura o String da barra de tírulo, registra o 
   // listener do mouse, dimensiona e mostra a janela
   public MouseDetails()
   {
      super( "Mouse e seus botoes" );

      addMouseListener( new MouseClickHandler() ); 

      setSize( 350, 150 );
      setVisible( true );
   }

   // desenha o String na posição na qual se clicou com o mouse
   public void paint( Graphics g )
   {
      // chama o método paint da superclasse
      super.paint( g );

      g.drawString( "Clicked @ [" + xPos + ", " + yPos + "]",
         xPos, yPos );
   }

   // executa aplicativo
   public static void main( String args[] )
   {
      MouseDetails application = new MouseDetails();

      application.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE );
   }

   // classe interna para tratar eventos de mouse
   private class MouseClickHandler extends MouseAdapter {

      // trata evento de clique do mouse e determina
      // qual o botão pressionado
      public void mouseClicked( MouseEvent event )
      {
         xPos = event.getX();
         yPos = event.getY();

         String title =
            "Clicked " + event.getClickCount() + " time(s)";
      
         // botão direito do mouse
         if ( event.isMetaDown() )      
            title += " with right mouse button";
      
         // botão do meio do mouse
         else if ( event.isAltDown() )  
            title += " with center mouse button";
      
      	 // botão esquerdo do mouse
         else                           
            title += " with left mouse button";

         setTitle( title );  // set title bar of window
         repaint();
      }
   }
} 