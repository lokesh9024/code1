
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class practice {
public void converter()
{
    JFrame f=new JFrame("converter");
    JLabel l1,l2,l3;                              
    JTextField t1,t2;//t3;
    JButton b1,b2,b3;
    JComboBox c1,c2;
    String S1[]={"do$toINR","INR to Euro","INR to pound","INR to Jyen","SGD to INR",
    "INR to rouble ","yuan to INR","INR to Dollar"};
   // String S2[]={"dollar","euro","ind","SA"};
    c1=new JComboBox<>(S1); 
    //c2=new JComboBox<>(S2);
    c1.setBounds(40, 40, 100, 20);            
   // c2.setBounds(120, 40, 70, 20);     
   
    f.add(c1);
   // f.add(c2);

    l1= new JLabel("ruppees");
    l2=new JLabel("dollars");
    l1.setBounds(40, 20, 100, 30);
    l2.setBounds(70,25 , 70, 30);
    t1=new JTextField("0");
    t2=new JTextField("0");
   // t3=new JTextField("0"+" euros");
   // t3.setForeground(Color.red);
    l3=new JLabel("euro");
    l3.setBounds(250, 10, 80, 25);
    l3.setForeground(Color.BLACK);
    //t3.setBounds(300, 10, 120, 30);
    
    t1.setBounds(40, 10, 70, 30);
    t2.setBounds(120, 10, 120, 30);
    t2.setForeground(Color.blue);
    b1= new JButton("Enter");
   // b2= new JButton("DOLLar");
    b3= new JButton("close");
    b1.setBounds(40, 80, 80, 20);                   
   // b2.setBounds(120, 80, 60 , 20);
    b3.setBounds(110, 110, 60, 30) ;

    
    c1.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
        int selection=c1.getSelectedIndex();
        switch(selection)
        {
          case 0:
        
          
               // double d6=Double.parseDouble(t1.getText());
               // double d7=d6*85.40;
               //String str3= String.valueOf(d7);
               //t1.setText(str3);
  

    b1.addActionListener(new ActionListener()
    {
    @Override
    public void actionPerformed(ActionEvent e){
           double d= Double.parseDouble(t1.getText());
           double d1=(d*85.40);
           String str1= String.valueOf(d1)+"ruppee";
           t2.setText(str1);
           

        
    }
      
    });
    break;
    case 1:
    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e)
{
 double d2=Double.parseDouble(t1.getText());
 double d4=(d2/88.60);
 String str3=String.valueOf(d4+"E");
 t2.setText(str3);
 
}
    });
  break;
  case 2:
  b1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e)
{
double d2=Double.parseDouble(t1.getText());
double d4=(d2/107.002);
String str3=String.valueOf(d4+"pu");
t2.setText(str3);

}
  });
  break;
  case 3:
  b1.addActionListener(new ActionListener()
  {
  @Override
  public void actionPerformed(ActionEvent e){
         double d= Double.parseDouble(t1.getText());
         double d1=(d/.54);
         String str1= String.valueOf(d1+"jp");
         t2.setText(str1);
  }//C:\Users\Admin\OneDrive\Desktop\c++\code1
    
  });
  break;
  case 4:
  b1.addActionListener(new ActionListener()
  {
  @Override
  public void actionPerformed(ActionEvent e){
         double d= Double.parseDouble(t1.getText());
         double d1=(d*62.72);
         String str1= String.valueOf(d1+"rupee");
         t2.setText(str1);
  }
    
  });
  break;
  case 5:
  b1.addActionListener(new ActionListener()
  {
  @Override
  public void actionPerformed(ActionEvent e){
         double d= Double.parseDouble(t1.getText());
         double d1=(d/0.854);
         String str1= String.valueOf(d1+"rou");
         t2.setText(str1);
  }

  });
  break;
case 6:
b1.addActionListener(new ActionListener()
  {
  @Override
  public void actionPerformed(ActionEvent e){
         double d= Double.parseDouble(t1.getText());
         double d1=(d*11.70);
         String str1= String.valueOf(d1+"INR");
         t2.setText(str1);
  }
  });
  break;
  case 7:
  b1.addActionListener(new ActionListener()
  {
  @Override
  public void actionPerformed(ActionEvent e){
         double d= Double.parseDouble(t1.getText());
         double d1=(d*11.70);
         String str1= String.valueOf(d1+"yuan");
         t2.setText(str1);
  }
  });
  break;
  
        }}
    
});
    
   // b2.addActionListener(new ActionListener() {
   //  @Override
   //  public void actionPerformed(ActionEvent e)
   //  {
   //    double d2=Double.parseDouble(t2.getText());
   //    double d3= (d2*85.40);
   //    String str2=String.valueOf(d3);
   //    t1.setText(str2);
   //  }
   //});
    b3.addActionListener(new ActionListener() {
      public void actionPerformed( ActionEvent e)
      {
        f.dispose();
      }
    });
    f.addWindowListener(new WindowAdapter()  {
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }
    });
    f.add(b1);
    //f.add(b2);
    f.add(t1);
    f.add(t2);
   // f.add(t3);
    f.add(b3);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.setVisible(true);
    f.setSize(400,300);
    f.setLayout(null);

  }
public static void main(String[] args) {
  practice ob=new practice();
  ob.converter();
}}
