import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ma_premiere_fenetre extends JFrame{
    public static void main(String[] args){
    
        //exemple creation des couleurs
	Color maCouleur1=new Color(0,255,150);    //vert pastel
	Color maCouleur2=new Color(255,153,102);      // saumon

        // Séparation du JFrame
        GridLayout grille = new GridLayout(1,2);

        // Création de la fenêtre avec JFrame
        JFrame maFenetre=new JFrame("titre de la fenetre");
        maFenetre.setLayout(grille);
        maFenetre.setLocationRelativeTo(null);

        // Création des panneaux
        JPanel p1=new JPanel();
        p1.setBackground(maCouleur1);
        JPanel p2=new JPanel();
        p2.setBackground(maCouleur2);
        
        // Après avoir modifié les couleurs des panneaux p1 et p2
        p1.repaint();
        p1.revalidate();
        p2.repaint();
        p2.revalidate();



        // Ajout des composants aux panneaux
        
        //JLabel    -->   simplement ecrire du texte
        JLabel l1=new JLabel("label dans panneau 1");
        p1.add(l1);

        JLabel l2=new JLabel("label dans panneau 2");
        p2.add(l2);
        
        
        //JTextFiel  -->  texte à rentrer par l'utilisateur 
	                 //et récupérer comme variable par la machine
        JTextField t=new JTextField(20);
        p1.add(t);
        
        JTextField t2 = new JTextField(15);
        p2.add(t2);
        
        // Créations d'actions pour les boutons
        ActionListener action1 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text_entre=t.getText();
                l1.setText(text_entre);
            }
        };
        
        ActionListener action2 = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text_entre=t2.getText();
                l2.setText(text_entre);
            }
        };

        //JButton

        JButton b1 = new JButton("nom du bouton 1");
        b1.addActionListener(action1);
        p1.add(b1);

        JButton b2 = new JButton("nom du bouton 2");
        b2.addActionListener(action2);
        p2.add(b2);
      



        // Ajout des panneaux à la fenêtre
        maFenetre.add(p1);
        maFenetre.add(p2);

        // Redessiner et recalculer la disposition
        maFenetre.repaint();
        maFenetre.revalidate();

        // Définition de la taille de la fenêtre
        maFenetre.setSize(1530, 835); //(base, hauteur) 
	                                    //ici sont placéés les tailles max
        
        // Affichage de la fenêtre
        maFenetre.setVisible(true);

        // Fermeture de la fenêtre
        maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //permet d'avoir un retour normal sur le terminal à la fermeture de la fenetre
    }
}

