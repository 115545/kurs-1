import java.awt.*; 															// ������ ������ awt
import java.awt.event.ActionEvent; 											// ������ ������ awt.event.ActionEvent
import java.awt.event.ActionListener; 										// ������ ������ awt.event.ActionListener
import java.awt.event.ItemEvent; 											// ������ ������ awt.event.ItemEvent
import java.awt.event.ItemListener; 										// ������ ������ event.ItemListener
import java.text.*; 														// ������ ������ text
import javax.swing.*; 														// ������ ������ swing
import javafx.*;															// ������ ������ javafx
public class nds															// �������� ����� "nds"
{																			// ����������� ������
	private JLabel log;														// ���������� ������� ������ log ���� Jlabel(�������)
	private JLabel log11;													// ���������� ������� ������ log11 ���� Jlabel(�������)
	private JLabel log1;													// ���������� ������� ������ log1 ���� Jlabel(�������)
    private JLabel log2;													// ���������� ������� ������ log2 ���� Jlabel(�������)
    private JLabel log3;													// ���������� ������� ������ log3 ���� Jlabel(�������)
    private JLabel log4;													// ���������� ������� ������ log4 ���� Jlabel(�������)
    private JLabel log5;													// ���������� ������� ������ log5 ���� Jlabel(�������)
    private JLabel log6;													// ���������� ������� ������ log6 ���� Jlabel(�������)
    private JLabel log7;													// ���������� ������� ������ log7 ���� Jlabel(�������)
    private JLabel log8;													// ���������� ������� ������ log8 ���� Jlabel(�������)
    private JLabel rubl1;													// ���������� ������� ������ rubl1 ���� Jlabel(�������)
    private JLabel rubl2;													// ���������� ������� ������ rubl2 ���� Jlabel(�������)
    private JLabel rubl3;													// ���������� ������� ������ rubl3 ���� Jlabel(�������)
    private JLabel rubl4;													// ���������� ������� ������ rubl4 ���� Jlabel(�������)
    private JLabel result;													// ���������� ������� ������ result ���� Jlabel(�������)
    private JTextField text1;												// ���������� ������� ������ text1 ���� JTextField(��������� ����)
    private JTextField text2;												// ���������� ������� ������ text2 ���� JTextField(��������� ����)
    private JTextField text3;												// ���������� ������� ������ text3 ���� JTextField(��������� ����)
    private JTextField text4;												// ���������� ������� ������ text4 ���� JTextField(��������� ����)
    private JComboBox comboBox;												// ���������� ������� ������ comboBox ���� JComboBox(���������� ������)
    private JComboBox comboBox1;											// ���������� ������� ������ comboBox1 ���� JComboBox(���������� ������)
    private JComboBox comboBox2;											// ���������� ������� ������ comboBox2 ���� JComboBox(���������� ������)
    private JComboBox comboBox3;											// ���������� ������� ������ comboBox3 ���� JComboBox(���������� ������)
    private JComboBox comboBox4;											// ���������� ������� ������ comboBox4 ���� JComboBox(���������� ������)
    private JButton Button1;												// ���������� ������� ������ Button1 ���� JButton(������)
    private JButton Button2;												// ���������� ������� ������ Button2 ���� JButton(������)
    private JFrame mainFrame;												// ���������� ������� ������ mainFrame ���� JFrame(�����)    
    nds() {																	// ������ ������
//colors
Color back = new Color(245,245,220);										// ���������� ���������� back �����
Color font = new Color(132,132,130);										// ���������� ���������� font �����
Color button = new Color(255, 229, 180);									// ���������� ���������� button �����
//labels  
        log = new JLabel("��������� ��� ������� ���");						// �������� ������� log ����  Jlable
       	Font head = new Font("Verdana", Font.BOLD, 12);						// ���������� ���������� head ����� ������
       	log.setFont(head);													// ���������� ������� log ����� ������ ������� �������� ���������� head
        log11 = new JLabel("������� ���� ������ � ����");					// �������� ������� log11 ����  Jlable
        log1 = new JLabel("���� ������ �������");							// �������� ������� log1 ����  Jlable
    	log2 = new JLabel("��� ��������");									// �������� ������� log2 ����  Jlable
        log3 = new JLabel("������� ��������� ����������");					// �������� ������� log3 ����  Jlable
        log4 = new JLabel("���������� ����������� �������");				// �������� ������� log4 ����  Jlable
        log5 = new JLabel("���������������� ���");							// �������� ������� log5 ����  Jlable
        log6 = new JLabel("����� � ���");       							// �������� ������� log6 ����  Jlable
        log6.setVisible(false);												// ������ �������� �������� ����������� ������� log6 = ���������
        log7 = new JLabel("����� ��� ���");        							// �������� ������� log7 ����  Jlable
        log7.setVisible(false);												// ������ �������� �������� ����������� ������� log7 = ���������
        log8 = new JLabel("���");              								// �������� ������� log8 ����  Jlable
        log8.setVisible(false);												// ������ �������� �������� ����������� ������� log8 = ���������
       	Font font1 = new Font("", Font.BOLD, 13);							// ���������� ���������� font1 ����� ������
       	log6.setFont(font1);												// ���������� ������� log6 ����� ������ ������� �������� ���������� font1
       	log7.setFont(font1);												// ���������� ������� log7 ����� ������ ������� �������� ���������� font1
       	log8.setFont(font1);												// ���������� ������� log8 ����� ������ ������� �������� ���������� font1
        rubl1 = new JLabel("���");											// �������� ������� rubl1 ����  Jlable
        rubl2 = new JLabel("���");											// �������� ������� rubl2 ����  Jlable
        rubl2.setVisible(false);											// ������ �������� �������� ����������� ������� rubl2 = ���������
        rubl3 = new JLabel("���");											// �������� ������� rubl3 ����  Jlable
        rubl3.setVisible(false);											// ������ �������� �������� ����������� ������� rubl3 = ���������
        rubl4 = new JLabel("���");											// �������� ������� rubl4 ����  Jlable
        rubl4.setVisible(false);											// ������ �������� �������� ����������� ������� rubl4 = ���������
        result = new JLabel("������� ����������� ������");					// �������� ������� result ����  JLabel
        result.setForeground(Color.RED);									// ��������� ����� ������ Jlabel result
//buttons
        Button1 = new JButton("���������");									// �������� ������� Button3 ����  JButton
      	Button1.setEnabled(false);											// ������� ������ Button3 � �� ��������� ��������� (��� �������) ������� setEnabled
      	Button2 = new JButton("������");									// �������� ������� Button4 ����  JButton
      	Button2.setVisible(false);											// ������ �������� �������� ����������� ������� Button2 = ���������
      	Button1.setBackground(button);										// ���������� ������� Button1 ����� ���� ������� �������� ���������� button
      	Button2.setBackground(button);										// ���������� ������� Button2 ����� ���� ������� �������� ���������� button
// comboboxes
    	String[] items = {													// �������� ����� ������ 			
    			"",															// ������ ������
                "���������� ����",											// ������ ������
                "�������������� ���������������"							// ������ ������
            };																// ����� �������� �����			
    	JComboBox editComboBox = new JComboBox(items);						// ����������� ����� � ���������� ������                        
        comboBox = new JComboBox(items);									// �������� �������  comboBox ����  JComboBox
        comboBox.setEnabled(false);											// ������� ������ �� ������ comboBox � ����������� ��������� (��� �������) ������� setEnabled
      	String[] items1 = {													// �������� ����� ������ 			
    			"",															// ������ ������
    			"� ���",													// ������ ������
    			"��� ���"													// ������ ������
            };																// ����� �������� �����	
      	JComboBox editComboBox1 = new JComboBox(items1);					// ����������� ����� � ���������� ������  
      	comboBox1 = new JComboBox(items1);									// �������� �������  comboBox1 ����  JComboBox
      	String[] items2 = {													// �������� ����� ������ 			
    			"",															// ������ ������
    			"�������",													// ������ ������
    			"�������"													// ������ ������
            };																// ����� �������� �����	
      	JComboBox editComboBox2 = new JComboBox(items2);					// ����������� ����� � ���������� ������  
      	comboBox2 = new JComboBox(items2);									// �������� �������  comboBox2 ����  JComboBox
      	comboBox2.setEnabled(false);										// ������� ������ �� ������ comboBox2 � ����������� ��������� (��� �������) ������� setEnabled   	
      	String[] items3 = {													// �������� ����� ������ 			
    			"",															// ������ ������
    			"����",														// ������ ������
    			"�����������"												// ������ ������
            };																// ����� �������� �����	
      	JComboBox editComboBox3 = new JComboBox(items3);					// ����������� ����� � ���������� ������
      	comboBox3 = new JComboBox(items3);									// �������� �������  comboBox3 ����  JComboBox
      	comboBox3.setEnabled(false);										// ������� ������ �� ������ comboBox3 � ����������� ��������� (��� �������) ������� setEnabled      	
      	String[] items4 = {													// �������� ����� ������ 			
    			"",															// ������ ������
    			"��",														// ������ ������
    			"���"														// ������ ������
            };																// ����� �������� �����	
      	JComboBox editComboBox4 = new JComboBox(items4);					// ����������� ����� � ���������� ������
      	comboBox4 = new JComboBox(items4);									// �������� �������  comboBox4 ����  JComboBox
      	comboBox4.setEnabled(false);										// ������� ������ �� ������ comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
	    comboBox.setBackground(button);										// ���������� ������� comboBox ����� ���� ������� �������� ���������� button
		comboBox1.setBackground(button);									// ���������� ������� comboBox1 ����� ���� ������� �������� ���������� button
		comboBox2.setBackground(button);									// ���������� ������� comboBox2 ����� ���� ������� �������� ���������� button
		comboBox3.setBackground(button);									// ���������� ������� comboBox3 ����� ���� ������� �������� ���������� button
		comboBox4.setBackground(button);									// ���������� ������� comboBox4 ����� ���� ������� �������� ���������� button
//textfields
        text1 = new JTextField("");											// �������� ������� text1 ����  JTextField
        text1.setHorizontalAlignment(JTextField.RIGHT);						// ��������� ������������ ���������� ����� ����� X ����
        text2 = new JTextField("");											// �������� ������� text2 ����  JTextField
        text2.setEditable(false);											// ������ �������������� ����  text2
        text2.setVisible(false);											// ������ �������� �������� ����������� ������� text2 = ���������
        text2.setHorizontalAlignment(JTextField.RIGHT);						// ��������� ������������ ���������� ����� ����� X ����
        text3 = new JTextField("");											// �������� ������� text3 ����  JTextField
        text3.setEditable(false);											// ������ �������������� ����  text3		
        text3.setVisible(false);											// ������ �������� �������� ����������� ������� text3 = ���������
        text3.setHorizontalAlignment(JTextField.RIGHT);						// ��������� ������������ ���������� ����� ����� X ����
        text4 = new JTextField("");											// �������� ������� text4 ����  JTextField
        text4.setEditable(false);											// ������ �������������� ����  text4		
        text4.setVisible(false);											// ������ �������� �������� ����������� ������� text4 = ���������
        text4.setHorizontalAlignment(JTextField.RIGHT);						// ��������� ������������ ���������� ����� ����� X ����
		text1.setBackground(button);										// ���������� ������� text1 ����� ���� ������� �������� ���������� button
		text2.setBackground(button);										// ���������� ������� text2 ����� ���� ������� �������� ���������� button
		text3.setBackground(button);										// ���������� ������� text3 ����� ���� ������� �������� ���������� button
		text4.setBackground(button);										// ���������� ������� text4 ����� ���� ������� �������� ���������� button
 //action listeners       
        ActionListener again = new ActionListener() {						// ���������� ��������� again (��������� ������� ������� �� ������)
            @Override														// ���������� ��������� Override
             public void actionPerformed(ActionEvent ar) {					// ���������� ������ actionPerformed
                comboBox.setSelectedItem("");								// ���������� ������� comboBox �������� ������� ������� ����
                comboBox1.setSelectedItem("");								// ���������� ������� comboBox1 �������� ������� ������� ����
                comboBox2.setSelectedItem("");								// ���������� ������� comboBox2 �������� ������� ������� ����
                comboBox3.setSelectedItem("");								// ���������� ������� comboBox3 �������� ������� ������� ����
                comboBox4.setSelectedItem("");								// ���������� ������� comboBox4 �������� ������� ������� ����
            	comboBox1.setEnabled(true);									// ������� ������ �� ������ comboBox1 � ��������� ��������� (��� �������) ������� setEnabled	
               	Button1.setEnabled(false);									// ������� ������ Button3 � �� ��������� ��������� (��� �������) ������� setEnabled
            	Button2.setEnabled(false);									// ������� ������ Button4 � �� ��������� ��������� (��� �������) ������� setEnabled
                text1.setEnabled(true);										// ���������� �������������� ����  text1
                log11.setVisible(true);										// ������ �������� �������� ����������� ������� log11 = �������
                log1.setVisible(true);										// ������ �������� �������� ����������� ������� log1 = �������
                log2.setVisible(true);										// ������ �������� �������� ����������� ������� log2 = �������
                log3.setVisible(true);										// ������ �������� �������� ����������� ������� log3 = �������
                log4.setVisible(true);										// ������ �������� �������� ����������� ������� log4 = �������
                log5.setVisible(true);										// ������ �������� �������� ����������� ������� log5 = �������
                text1.setVisible(true);										// ������ �������� �������� ����������� ������� text1 = �������
                comboBox.setVisible(true);									// ������ �������� �������� ����������� ������� comboBox = �������
                comboBox1.setVisible(true);									// ������ �������� �������� ����������� ������� comboBox1 = �������
                comboBox2.setVisible(true);									// ������ �������� �������� ����������� ������� comboBox2 = �������
                comboBox3.setVisible(true);									// ������ �������� �������� ����������� ������� comboBox3 = �������
                comboBox4.setVisible(true);									// ������ �������� �������� ����������� ������� comboBox4 = �������
                Button1.setVisible(true);									// ������ �������� �������� ����������� ������� Button1 = �������
                rubl1.setVisible(true);										// ������ �������� �������� ����������� ������� rubl1 = ���������
                Button2.setVisible(false);									// ������ �������� �������� ����������� ������� Button2 = ���������
                log6.setVisible(false);										// ������ �������� �������� ����������� ������� log6 = ���������
                log7.setVisible(false);										// ������ �������� �������� ����������� ������� log7 = ���������
                log8.setVisible(false);										// ������ �������� �������� ����������� ������� log8 = ���������
                text2.setVisible(false);									// ������ �������� �������� ����������� ������� text2 = ���������
                text3.setVisible(false);									// ������ �������� �������� ����������� ������� text3 = ���������
                text4.setVisible(false);									// ������ �������� �������� ����������� ������� text4 = ���������
                rubl2.setVisible(false);									// ������ �������� �������� ����������� ������� rubl2 = ���������
                rubl3.setVisible(false);									// ������ �������� �������� ����������� ������� rubl3 = ���������
                rubl4.setVisible(false);									// ������ �������� �������� ����������� ������� rubl4 = ���������
                result.setText("������� ����������� ������");				// ����������� �������� ������� result ��������� �������� "������� ����������� ������"
            }																// ����� ������ actionPerformed    
        };																	// ����� ������ ��������� again
        final ActionListener bnds1 = new ActionListener() {					// ���������� ��������� bnds1 (��������� ������� ������� �� ������)
            @Override														// ���������� ��������� Override
             public void actionPerformed(ActionEvent calc) {				// ���������� ������ actionPerformed	
               try {														// ���������� ��������� try (������� ��������� ��������)
                double cost2 = Double.parseDouble(text1.getText()); 		// ����������� ����(Double) ����������(cost2) ������� parseDouble,������������� ���������� cost2 ���������� �������� �� text1
                double nds2 = cost2 * 0.1;									// ����������� ���� ����������(nds2), ������������� nds2 �������� ���������
                double summas2 = cost2 + nds2;								// ����������� ���� ����������(summas2), ������������� summas2 �������� ���������
                double summabez2 = cost2; 									// ����������� ���� ����������(summabez2), ������������� summabez2 �������� ���������
                NumberFormat na = NumberFormat.getInstance();				// ���������� ������ NumberFormat ���������� na ������� getInstance
                na.setMaximumFractionDigits(2);   							// ����������� ���������� ���� ����� ������� �� 2-��
                text2.setText(""+na.format(summas2));						// ����� �������� summas2 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                text3.setText(""+na.format(summabez2));						// ����� �������� summabez2 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                text4.setText(""+na.format(nds2));							// ����� �������� nds2 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                result.setText("");											// ����� ������ "" � ����  result, ��������� ����� setText
                log11.setVisible(false);									// ������ �������� �������� ����������� ������� log11 = ���������
                log1.setVisible(false);										// ������ �������� �������� ����������� ������� log1 = ���������
                log2.setVisible(false);										// ������ �������� �������� ����������� ������� log2 = ���������
                log3.setVisible(false);										// ������ �������� �������� ����������� ������� log3 = ���������
                log4.setVisible(false);										// ������ �������� �������� ����������� ������� log4 = ���������
                log5.setVisible(false);										// ������ �������� �������� ����������� ������� log5 = ���������
                text1.setVisible(false);									// ������ �������� �������� ����������� ������� text1 = ���������
                comboBox.setVisible(false);									// ������ �������� �������� ����������� ������� comboBox = ���������
                comboBox1.setVisible(false);								// ������ �������� �������� ����������� ������� comboBox1 = ���������
                comboBox2.setVisible(false);								// ������ �������� �������� ����������� ������� comboBox2 = ���������
                comboBox3.setVisible(false);								// ������ �������� �������� ����������� ������� comboBox3 = ���������
                comboBox4.setVisible(false);								// ������ �������� �������� ����������� ������� comboBox4 = ���������
                Button1.setVisible(false);									// ������ �������� �������� ����������� ������� Button1 = ���������
                rubl1.setVisible(false);									// ������ �������� �������� ����������� ������� rubl1 = ���������
                Button2.setVisible(true);									// ������ �������� �������� ����������� ������� Button2 = �������
                log6.setVisible(true);										// ������ �������� �������� ����������� ������� log6 = �������
                log7.setVisible(true);										// ������ �������� �������� ����������� ������� log7 = �������
                log8.setVisible(true);										// ������ �������� �������� ����������� ������� log8 = �������
                text2.setVisible(true);										// ������ �������� �������� ����������� ������� text2 = �������
                text3.setVisible(true);										// ������ �������� �������� ����������� ������� text3 = �������
                text4.setVisible(true);										// ������ �������� �������� ����������� ������� text4 = �������
                rubl2.setVisible(true);										// ������ �������� �������� ����������� ������� rubl2 = �������
                rubl3.setVisible(true);										// ������ �������� �������� ����������� ������� rubl3 = �������
                rubl4.setVisible(true);										// ������ �������� �������� ����������� ������� rubl4 = �������
                Button2.setEnabled(true);									// ������� ������� Button2 � ��������� ��������� (��� �������) ������� setEnabled
                comboBox1.setEnabled(false);								// ������� ������� comboBox1 � ����������� ��������� (��� �������) ������� setEnabled
                comboBox2.setEnabled(false);								// ������� ������� comboBox2 � ����������� ��������� (��� �������) ������� setEnabled
                comboBox3.setEnabled(false);								// ������� ������� comboBox3 � ����������� ��������� (��� �������) ������� setEnabled
                comboBox4.setEnabled(false);								// ������� ������� comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
                comboBox.setEnabled(false);									// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                text1.setEnabled(false);									// ������� ������� text1 � ����������� ��������� (��� �������) ������� setEnabled
               }															// ����� ���������� �������� ��������� try
               catch ( NumberFormatException error ) {						// �������� ���������� ���������� catch
                   result.setText("��������� �������� ������"); 			// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                   result.setForeground(Color.RED);						// ��������� ����� ������ Jlabel result
             }																// ����� ���������� �������� ��� ��������� ���������� ���������� catch
            }																// ����� ������ actionPerformed    
        };																	// ����� ������ ��������� bnds1
           final ActionListener bnds2 = new ActionListener() {				// ���������� ��������� bnds2 (��������� ������� ������� �� ������)
           @Override														// ���������� ��������� Override
            public void actionPerformed(ActionEvent calc) {				// ���������� ������ actionPerformed	
                try {														// ���������� ��������� try (������� ��������� ��������)
                   double cost3 = Double.parseDouble(text1.getText());		// ����������� ����(Double) ����������(cost3) ������� parseDouble,������������� ���������� cost3 ���������� �������� �� text1
                   double nds3 = 0;										// ����������� ���� ����������(nds3), ������������� nds3 �������� ���������
                   double summas3 = cost3 + nds3;							// ����������� ���� ����������(summas3), ������������� summas3 �������� ���������
                   double summabez3 = cost3; 								// ����������� ���� ����������(summabez3), ������������� summabez3 �������� ���������
                   NumberFormat na = NumberFormat.getInstance();			// ���������� ������ NumberFormat ���������� na ������� getInstance
                   na.setMaximumFractionDigits(2);  						// ����������� ���������� ���� ����� ������� �� 2-��
                   text2.setText(""+na.format(summas3));					// ����� �������� summas3 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   text3.setText(""+na.format(summabez3));					// ����� �������� summabez3 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   text4.setText(""+na.format(nds3));						// ����� �������� nds3 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   result.setText("");										// ����� ������ "" � ����  result, ��������� ����� setText
                   log11.setVisible(false);								// ������ �������� �������� ����������� ������� log11 = ���������
                   log1.setVisible(false); 								// ������ �������� �������� ����������� ������� log1 = ���������
                   log2.setVisible(false); 								// ������ �������� �������� ����������� ������� log2 = ���������
                   log3.setVisible(false); 								// ������ �������� �������� ����������� ������� log3 = ���������
                   log4.setVisible(false); 								// ������ �������� �������� ����������� ������� log4 = ���������
                   log5.setVisible(false); 								// ������ �������� �������� ����������� ������� log5 = ���������
                   text1.setVisible(false); 								// ������ �������� �������� ����������� ������� text1 = ���������
                   comboBox.setVisible(false); 							// ������ �������� �������� ����������� ������� comboBox = ���������
                   comboBox1.setVisible(false); 							// ������ �������� �������� ����������� ������� comboBox1 = ���������
                   comboBox2.setVisible(false); 							// ������ �������� �������� ����������� ������� comboBox2 = ���������
                   comboBox3.setVisible(false); 							// ������ �������� �������� ����������� ������� comboBox3 = ���������
                   comboBox4.setVisible(false); 							// ������ �������� �������� ����������� ������� comboBox4 = ���������
                   Button1.setVisible(false); 								// ������ �������� �������� ����������� ������� Button1 = ���������
                   rubl1.setVisible(false); 								// ������ �������� �������� ����������� ������� rubl1 = ���������
                   Button2.setVisible(true); 								// ������ �������� �������� ����������� ������� Button2 = �������
                   log6.setVisible(true); 									// ������ �������� �������� ����������� ������� log6 = �������
                   log7.setVisible(true); 									// ������ �������� �������� ����������� ������� log7 = �������
                   log8.setVisible(true); 									// ������ �������� �������� ����������� ������� log8 = �������
                   text2.setVisible(true);									// ������ �������� �������� ����������� ������� text2 = �������
                   text3.setVisible(true);									// ������ �������� �������� ����������� ������� text3 = �������
                   text4.setVisible(true);									// ������ �������� �������� ����������� ������� text4 = �������
                   rubl2.setVisible(true);									// ������ �������� �������� ����������� ������� rubl2 = �������
                   rubl3.setVisible(true);									// ������ �������� �������� ����������� ������� rubl3 = �������
                   rubl4.setVisible(true);									// ������ �������� �������� ����������� ������� rubl4 = �������
                   Button2.setEnabled(true);								// ������� ������� Button2 � ��������� ��������� (��� �������) ������� setEnabled
                   comboBox1.setEnabled(false);							// ������� �������  comboBox1 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox2.setEnabled(false);							// ������� �������  comboBox2 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox3.setEnabled(false);							// ������� �������  comboBox3 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox4.setEnabled(false);							// ������� �������  comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox.setEnabled(false);								// ������� �������  comboBox � ����������� ��������� (��� �������) ������� setEnabled
                   text1.setEnabled(false);								// ������� �������  text1 � ����������� ��������� (��� �������) ������� setEnabled
                }															// ����� ���������� �������� ��������� try
            catch ( NumberFormatException error ) {						// �������� ���������� ���������� catch
                   result.setText("��������� �������� ������"); 			// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                   result.setForeground(Color.RED);						// ��������� ����� ������ Jlabel result
             }																// ����� ���������� �������� ��� ��������� ���������� ���������� catch
            }																// ����� ������ actionPerformed    
        };																	// ����� ������ ��������� bnds2       
       final ActionListener snds1 = new ActionListener() {					// ���������� ��������� snds1 (��������� ������� ������� �� ������)
           @Override														// ���������� ��������� Override
            public void actionPerformed(ActionEvent calc) {				// ���������� ������ actionPerformed	
                try {														// ���������� ��������� try (������� ��������� ��������)
                   double cost4 = Double.parseDouble(text1.getText());		// ����������� ����(Double) ����������(cost4) ������� parseDouble,������������� ���������� cost4 ���������� �������� �� text1
                   double nds4 = cost4-cost4/1.1;							// ����������� ���� ����������(nds4), ������������� nds4 �������� ���������
                   double summas4 = cost4;									// ����������� ���� ����������(summas4), ������������� summas4 �������� ���������
                   double summabez4 = cost4/1.1; 							// ����������� ���� ����������(summabez4), ������������� summabez4 �������� ���������
                   NumberFormat na = NumberFormat.getInstance();			// ���������� ������ NumberFormat ���������� na ������� getInstance
                   na.setMaximumFractionDigits(2); 						// ����������� ���������� ���� ����� ������� �� 2-��
                   text2.setText(""+na.format(summas4));					// ����� �������� summas4 � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   text3.setText(""+na.format(summabez4));					// ����� �������� summabez4 � ���� text3, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   text4.setText(""+na.format(nds4));						// ����� �������� nds4 � ���� text4, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                   result.setText("");										// ����� ������ "" � ����  result, ��������� ����� setText
                   log11.setVisible(false);								// ������ �������� �������� ����������� ������� log11 = ���������
                   log1.setVisible(false);									// ������ �������� �������� ����������� ������� log1 = ���������
                   log2.setVisible(false);									// ������ �������� �������� ����������� ������� log2 = ���������
                   log3.setVisible(false);									// ������ �������� �������� ����������� ������� log3 = ���������
                   log4.setVisible(false);									// ������ �������� �������� ����������� ������� log4 = ���������
                   log5.setVisible(false);									// ������ �������� �������� ����������� ������� log5 = ���������
                   text1.setVisible(false);								// ������ �������� �������� ����������� ������� text1 = ���������
                   comboBox.setVisible(false);								// ������ �������� �������� ����������� ������� comboBox = ���������
                   comboBox1.setVisible(false);							// ������ �������� �������� ����������� ������� comboBox1 = ���������
                   comboBox2.setVisible(false);							// ������ �������� �������� ����������� ������� comboBox2 = ���������
                   comboBox3.setVisible(false);							// ������ �������� �������� ����������� ������� comboBox3 = ���������
                   comboBox4.setVisible(false);							// ������ �������� �������� ����������� ������� comboBox4 = ���������
                   Button1.setVisible(false);								// ������ �������� �������� ����������� ������� Button1 = ���������
                   rubl1.setVisible(false);								// ������ �������� �������� ����������� ������� rubl1 = ���������
                   Button2.setVisible(true);								// ������ �������� �������� ����������� ������� Button2 = �������
                   log6.setVisible(true);									// ������ �������� �������� ����������� ������� log6 = �������
                   log7.setVisible(true);									// ������ �������� �������� ����������� ������� log7 = �������
                   log8.setVisible(true);									// ������ �������� �������� ����������� ������� log8 = �������
                   text2.setVisible(true);									// ������ �������� �������� ����������� ������� text2 = �������
                   text3.setVisible(true);									// ������ �������� �������� ����������� ������� text3 = �������
                   text4.setVisible(true);									// ������ �������� �������� ����������� ������� text4 = �������
                   rubl2.setVisible(true);									// ������ �������� �������� ����������� ������� rubl2 = �������
                   rubl3.setVisible(true);									// ������ �������� �������� ����������� ������� rubl3 = �������
                   rubl4.setVisible(true);									// ������ �������� �������� ����������� ������� rubl4 = �������
                   Button2.setEnabled(true);								// ������� ������� Button2 � ��������� ��������� (��� �������) ������� setEnabled
                   comboBox1.setEnabled(false);							// ������� ������� comboBox1 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox2.setEnabled(false);							// ������� ������� comboBox2 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox3.setEnabled(false);							// ������� ������� comboBox3 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox4.setEnabled(false);							// ������� ������� comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
                   comboBox.setEnabled(false);								// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                   text1.setEnabled(false);								// ������� ������� text1 � ����������� ��������� (��� �������) ������� setEnabled
                }															// ����� ���������� �������� ��������� try
            catch ( NumberFormatException error ) {						// �������� ���������� ���������� catch		
                   result.setText("��������� �������� ������");			// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                   result.setForeground(Color.RED);						// ��������� ����� ������ Jlabel result ������� setForeground
             }																// ����� ���������� �������� ��� ��������� ���������� ���������� catch
            }																// ����� ������ actionPerformed    
        };																	// ����� ������ ��������� snds1        
        final ActionListener snds = new ActionListener() {					// ���������� ��������� snds (��������� ������� ������� �� ������)
             @Override														// ��������� ��������� Override
              public void actionPerformed(ActionEvent calc) {				// ���������� ������ actionPerformed
                  try {													// ���������� ��������� try (������� ��������� ��������)
                     double cost = Double.parseDouble(text1.getText());	// ����������� ����(Double) ����������(cost) ������� parseDouble, ������������� ���������� cost ���������� �������� �� text1
                     double nds = cost-cost/1.18;							// ����������� ���� ����������(nds), ������������� nds �������� ���������
                     double summas = cost;									// ����������� ���� ����������(summas), ������������� (summas �������� ���������		
                     double summabez = cost/1.18; 							// ����������� ���� ����������(summabez), ������������� summabez �������� ���������
                     NumberFormat na = NumberFormat.getInstance();			// ���������� ������ NumberFormat ���������� na ������� getInstance
                     na.setMaximumFractionDigits(2);  						// ����������� ���������� ���� ����� ������� �� 2-��
                     text2.setText(""+na.format(summas));					// ����� �������� summas � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                     text3.setText(""+na.format(summabez));				// ����� �������� summabez � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                     text4.setText(""+na.format(nds));						// ����� �������� nds � ���� text2, ��������� ����� setText � ����������� ���������� ���� ����� ������� ������� format
                     result.setText("");									// ����� �����f "" � ����  result, ��������� ����� setText
                     log11.setVisible(false);							 	// ������ �������� �������� ����������� ������� log11 = ���������
                     log1.setVisible(false);							 	// ������ �������� �������� ����������� ������� log1 = ���������
                     log2.setVisible(false);							 	// ������ �������� �������� ����������� ������� log2 = ���������
                     log3.setVisible(false);							 	// ������ �������� �������� ����������� ������� log3 = ���������
                     log4.setVisible(false);							 	// ������ �������� �������� ����������� ������� log4 = ���������
                     log5.setVisible(false);							 	// ������ �������� �������� ����������� ������� log5 = ���������
                     text1.setVisible(false);							 	// ������ �������� �������� ����������� ������� text1 = ���������
                     comboBox.setVisible(false);						    // ������ �������� �������� ����������� ������� comboBox = ���������
                     comboBox1.setVisible(false);						    // ������ �������� �������� ����������� ������� comboBox1 = ���������
                     comboBox2.setVisible(false);						    // ������ �������� �������� ����������� ������� comboBox2 = ���������
                     comboBox3.setVisible(false);						    // ������ �������� �������� ����������� ������� comboBox3 = ���������
                     comboBox4.setVisible(false);						    // ������ �������� �������� ����������� ������� comboBox4 = ���������
                     Button1.setVisible(false); 						    // ������ �������� �������� ����������� ������� Button1 = ���������
                     rubl1.setVisible(false); 						   		// ������ �������� �������� ����������� ������� rubl1 = ���������
                     Button2.setVisible(true); 						   	// ������ �������� �������� ����������� ������� Button2 = �������
                     log6.setVisible(true); 						   		// ������ �������� �������� ����������� ������� log6 = �������
                     log7.setVisible(true); 						   		// ������ �������� �������� ����������� ������� log7 = �������
                     log8.setVisible(true); 						   		// ������ �������� �������� ����������� ������� log8 = �������
                     text2.setVisible(true); 						   		// ������ �������� �������� ����������� ������� text2 = �������
                     text3.setVisible(true); 						   		// ������ �������� �������� ����������� ������� text3 = �������
                     text4.setVisible(true); 						   		// ������ �������� �������� ����������� ������� text4 = �������
                     rubl2.setVisible(true); 						   		// ������ �������� �������� ����������� ������� rubl2 = �������
                     rubl3.setVisible(true); 						   		// ������ �������� �������� ����������� ������� rubl3 = �������
                     rubl4.setVisible(true); 						   		// ������ �������� �������� ����������� ������� rubl4 = �������
                     Button2.setEnabled(true);								// ������� ������� Button2 � ��������� ���������(��� �������) ������� setEnabled
                     comboBox1.setEnabled(false);							// ������� ������� comboBox1 � �� ��������� ��������� (��� �������) ������� setEnabled
                     comboBox2.setEnabled(false);							// ������� ������� comboBox2 � �� ��������� ��������� (��� �������) ������� setEnabled
                     comboBox3.setEnabled(false);							// ������� ������� comboBox3 � �� ��������� ��������� (��� �������) ������� setEnabled
                     comboBox4.setEnabled(false);							// ������� ������� comboBox4 � �� ��������� ��������� (��� �������) ������� setEnabled
                     comboBox.setEnabled(false);							// ������� ������� comboBox � �� ��������� ��������� (��� �������) ������� setEnabled
                     text1.setEnabled(false);								// ������� ������� text1 � �� ��������� ��������� (��� �������) ������� setEnabled
                  }														// ����� ���������� �������� ��������� try
              catch ( NumberFormatException error ) {						// �������� ���������� ���������� catch
                     result.setText("��������� �������� ������"); 		// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
                     result.setForeground(Color.RED);						// ��������� ����� ������ Jlabel result ������� setForeground
               }															// ����� ���������� �������� ��� ��������� ���������� ���������� catch
              }															// ����� ������ actionPerformed    
          };																// ����� ������ ��������� snds
          final ActionListener bnds = new ActionListener() {				// ���������� ��������� bnds (��������� ������� ������� �� ������)
     	     @Override													// ���������� ��������� Override
     	      public void actionPerformed(ActionEvent calc1) {			// ���������� ������ actionPerformed
     	          try {													// ���������� ��������� try (������� ��������� ��������)
     	             double cost = Double.parseDouble(text1.getText());	// ����������� ���� (Double) ����������(cost) ������� parseDouble, ������������� ���������� cost ���������� �������� �� text1
     	             double nds1 = cost * 0.18;							// ����������� ���� ����������(nds1), ������������� nds1 �������� ���������
     	             double summas1 = cost + nds1;						// ����������� ���� ����������(summas1), ������������� summas1 �������� ���������
     	             double summabez1 = cost;							// ����������� ���� ����������(summas1), ������������� summabez1 �������� ���������
     	             NumberFormat na = NumberFormat.getInstance();		// ���������� ������ NumberFormat ���������� na ������� getInstance
                      na.setMaximumFractionDigits(2);   					// ����������� ���������� ���� ����� ������� �� 2-��
     	             text2.setText(""+na.format(summas1));				// ����� �������� summas1 � ���� text2, ����� ����� setText � ����������� ���������� ���� ����� ������� ������� format
     	             text3.setText(""+na.format(summabez1));			// ����� �������� summabez1 � ���� text2, ����� ����� setText � ����������� ���������� ���� ����� ������� ������� format
     	             text4.setText(""+na.format(nds1)); 				// ����� �������� nds1 � ���� text2, ����� ����� setText � ����������� ���������� ���� ����� ������� ������� format
     	             result.setText("");								// ����� ������ "" � ����  result, ��������� ����� setText
                      log11.setVisible(false);							// ������ �������� �������� ����������� ������� log11 = ���������
                      log1.setVisible(false);							// ������ �������� �������� ����������� ������� log1 = ���������
                      log2.setVisible(false);							// ������ �������� �������� ����������� ������� log2 = ���������
                      log3.setVisible(false);							// ������ �������� �������� ����������� ������� log3 = ���������
                      log4.setVisible(false);							// ������ �������� �������� ����������� ������� log4 = ���������
                      log5.setVisible(false);							// ������ �������� �������� ����������� ������� log5 = ���������
                      text1.setVisible(false);							// ������ �������� �������� ����������� ������� text1 = ���������
                      comboBox.setVisible(false);						// ������ �������� �������� ����������� ������� comboBox = ���������
                      comboBox1.setVisible(false);						// ������ �������� �������� ����������� ������� comboBox1 = ���������
                      comboBox2.setVisible(false);						// ������ �������� �������� ����������� ������� comboBox2 = ���������
                      comboBox3.setVisible(false);						// ������ �������� �������� ����������� ������� comboBox3 = ���������
                      comboBox4.setVisible(false);						// ������ �������� �������� ����������� ������� comboBox4 = ���������
                      Button1.setVisible(false);							// ������ �������� �������� ����������� ������� Button1 = ���������
                      rubl1.setVisible(false);							// ������ �������� �������� ����������� ������� rubl1 = ���������
                      Button2.setVisible(true);							// ������ �������� �������� ����������� ������� Button2 = �������
                      log6.setVisible(true);								// ������ �������� �������� ����������� ������� log6 = �������
                      log7.setVisible(true);								// ������ �������� �������� ����������� ������� log7 = �������
                      log8.setVisible(true);								// ������ �������� �������� ����������� ������� log8 = �������
                      text2.setVisible(true);							// ������ �������� �������� ����������� ������� text2 = �������
                      text3.setVisible(true);							// ������ �������� �������� ����������� ������� text3 = �������
                      text4.setVisible(true);							// ������ �������� �������� ����������� ������� text4 = �������
                      rubl2.setVisible(true);							// ������ �������� �������� ����������� ������� rubl2 = �������
                      rubl3.setVisible(true);							// ������ �������� �������� ����������� ������� rubl3 = �������
                      rubl4.setVisible(true);							// ������ �������� �������� ����������� ������� rubl4 = �������
     	             Button2.setEnabled(true);							// ������� ������� Button2 � ��������� ��������� (��� �������) ������� setEnabled
     	             comboBox1.setEnabled(false);						// ������� ������� comboBox1 � ����������� ��������� (��� �������) ������� setEnabled
                      comboBox2.setEnabled(false);						// ������� ������� comboBox2 � ����������� ��������� (��� �������) ������� setEnabled
                      comboBox3.setEnabled(false);						// ������� ������� comboBox3 � ����������� ��������� (��� �������) ������� setEnabled
                      comboBox4.setEnabled(false);						// ������� ������� comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
                      comboBox.setEnabled(false);						// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                      text1.setEnabled(false);							// ������� ������� text1 � ����������� ��������� (��� �������) ������� setEnabled
     	          }														// ����� ���������� �������� ��������� try
     	      catch ( NumberFormatException error ) {					// �������� ���������� ���������� catch
     	             result.setText("��������� �������� ������");  	// ����� ������ "��������� �������� ������" � ����  result, ����� ����� setText
     	             result.setForeground(Color.RED); 					// ��������� ����� ������ Jlabel result ������� setForeground
     	       }														// ����� ���������� �������� ��� ��������� ���������� ���������� catch   
     	      }															// ����� ������ actionPerformed    
     	  };															// ����� ������ ��������� bnds	
        	  final ActionListener combob1 = new ActionListener() {			// ���������� ��������� combob1 (��������� ������� ������ �� ������)
               public void actionPerformed(ActionEvent a2) {  			// ���������� ������ actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// ���������� ���������� box �������� JComboBox
                           String item = (String)box.getSelectedItem();  // ���������� ���������� item �������� box
                           if(item == "��"){ 							// �������� ���������� ����������� ��������� ���������� if
                          	 comboBox.setEnabled(false);				// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                          	 comboBox.setSelectedItem("");				// ���������� ������� comboBox �������� ������� ������� ����
                          	 Button1.addActionListener(bnds1); 			// ���������� ������� Button1 ��������� bnds1
                          	 Button1.removeActionListener(bnds); 		// ����������� ������������� ������� Button1 ���������� bnds
                          	 Button1.removeActionListener(snds); 		// ����������� ������������� ������� Button1 ���������� snds
                          	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������� Button1 ���������� snds1
                          	 Button1.removeActionListener(bnds2); 		// ����������� ������������� ������� Button1 ���������� bnds2
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� if   
                           else if(item == "���"){	 					// �������� ���������� ����������� ��������� ���������� else if
                           	 comboBox.setEnabled(true);					// ������� ������� comboBox � ��������� ��������� (��� �������) ������� setEnabled
                          	 Button1.removeActionListener(bnds); 		// ����������� ������� Button1 ��������� bnds
                          	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button1 ���������� bnds1                            	
                          	 Button1.removeActionListener(snds); 		// ����������� ������������� ������ Button1 ���������� snds
                          	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������ Button1 ���������� snds1
                          	 Button1.removeActionListener(bnds2); 		// ����������� ������������� ������ Button1 ���������� bnds2
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� else if
                           else if(item == ""){ 							// �������� ���������� ����������� ��������� ���������� else if
                          	 comboBox.setEnabled(false);				// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                              comboBox.setSelectedItem("");				// ���������� ������� comboBox �������� ������� ������� ����
                          	 Button1.removeActionListener(bnds); 		// ���������� ������� Button1 ��������� bnds
                          	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button1 ���������� bnds1                            	
                          	 Button1.removeActionListener(snds); 		// ����������� ������������� ������ Button1 ���������� snds
                          	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������ Button1 ���������� snds1
                          	 Button1.removeActionListener(bnds2); 		// ����������� ������������� ������ Button1 ���������� bnds2
                           };											// ����� ���������� �������� ��� ���������� ������� ��������� else if                                 
                  }														// ����� ������ actionPerformed    
              };															// ����� ������ ��������� combob1
           	  final ActionListener combos1 = new ActionListener() {		// ���������� ��������� combob (��������� ������� ������ �� ������)
                   public void actionPerformed(ActionEvent a2) {  		// ���������� ������ actionPerformed
                       JComboBox box = (JComboBox)a2.getSource(); 		// ���������� ���������� box �������� JComboBox
                             String item = (String)box.getSelectedItem();// ���������� ���������� item �������� box	
                               if(item == "��"){ 						// �������� ���������� ����������� ��������� ���������� if
                              	 comboBox.setEnabled(false);			// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                              	 comboBox.setSelectedItem("");			// ���������� ������� comboBox �������� ������� ������� ����
                              	 Button1.addActionListener(snds1); 		// ���������� ������� Button1 ��������� snds1
                              	 Button1.removeActionListener(bnds); 	// ����������� ������������� ������ Button1 ���������� bnds
                              	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button1 ���������� snds
                              	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button1 ���������� bnds2
                              	 Button1.removeActionListener(bnds1); 	// ����������� ������������� ������ Button1 ���������� bnds1
                               }											// ����� ���������� �������� ��� ���������� ������� ��������� if   
                               else if(item == "���"){	 				// �������� ���������� ����������� ��������� ���������� else if
                              	 comboBox.setEnabled(true);				// ������� ������� comboBox � ��������� ��������� (��� �������) ������� setEnabled
                              	 Button1.removeActionListener(bnds); 	// ���������� ������� Button1 ��������� bnds
                              	 Button1.removeActionListener(bnds1); 	// ����������� ������������� ������ Button1 ���������� bnds1                            	
                              	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button1 ���������� snds
                              	 Button1.removeActionListener(snds1); 	// ����������� ������������� ������ Button1 ���������� snds1
                              	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button1 ���������� bnds2
                               }											// ����� ���������� �������� ��� ���������� ������� ��������� else if
                               else if(item == ""){ 						// �������� ���������� ����������� ��������� ���������� else if
                              	 comboBox.setEnabled(false);			// ������� ������� comboBox � ����������� ��������� (��� �������) ������� setEnabled
                                  comboBox.setSelectedItem("");			// ���������� ������� comboBox �������� ������� ������� ����
                              	 Button1.removeActionListener(bnds); 	// ���������� ������� Button1 ��������� bnds
                              	 Button1.removeActionListener(bnds1); 	// ����������� ������������� ������ Button1 ���������� bnds1                            	
                              	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button1 ���������� snds
                              	 Button1.removeActionListener(snds1); 	// ����������� ������������� ������ Button1 ���������� snds1
                              	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button1 ���������� bnds2
                               };										// ����� ���������� �������� ��� ���������� ������� ��������� else if                                 
                      }													// ����� ������ actionPerformed    
                  };														// ����� ������ ��������� combos1
     	  final ActionListener combos = new ActionListener() {			// ���������� ��������� combos (��������� ������� ������ �� ������)
               public void actionPerformed(ActionEvent a) {  			// ���������� ����� actionPerformed
                   JComboBox box = (JComboBox)a.getSource();  			// ���������� ���������� box �������� JComboBox
                           String item = (String)box.getSelectedItem(); 	// ���������� ���������� item �������� box
                           if(item == "���������� ����"){ 				// �������� ���������� ����������� ��������� ���������� if
                          	 Button1.addActionListener(snds1); 			// ���������� ������� Button1 ��������� snds1
                          	 Button1.removeActionListener(snds); 		// ����������� ������������� ������ Button1 ���������� snds
                          	 Button1.removeActionListener(bnds); 		// ����������� ������������� ������ Button1 ���������� bnds
                          	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button1 ���������� bnds1
                          	 Button1.removeActionListener(bnds2);  		// ����������� ������������� ������ Button1 ���������� bnds2
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� if   
                      else if(item == "�������������� ���������������"){ // �������� ���������� ����������� ��������� ���������� else if
                          	 Button1.addActionListener(snds); 			// ���������� ������� Button1 ��������� snds
                          	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������ Button1 ���������� snds1
                          	 Button1.removeActionListener(bnds); 		// ����������� ������������� ������ Button1 ���������� bnds
                          	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button1 ���������� bnds1
                          	 Button1.removeActionListener(bnds2); 		// ����������� ������������� ������ Button1 ���������� bnds2
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� else if   
                           else if(item == ""){ 							// �������� ���������� ����������� ��������� ���������� else if;
                           	 Button1.removeActionListener(snds); 		// ����������� ������������� ������ Button3 ���������� snds
                         	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������ Button3 ���������� snds1
                           	 Button1.removeActionListener(bnds); 		// ����������� ������������� ������ Button3 ���������� snds
                           	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button3 ���������� bnds1
                           	 Button1.removeActionListener(bnds2); 		// ����������� ������������� ������ Button3 ���������� bnds2
                           };											// ����� ���������� �������� ��� ���������� ������� ��������� else if                              
                  }														// ����� ������ actionPerformed         
              };															// ����� ������ ��������� combos                  
              final ActionListener combob = new ActionListener() {		// ���������� ��������� combob (��������� ������� ������ �� ������)
                  public void actionPerformed(ActionEvent a1) {  		// ���������� ������ actionPerformed
                      JComboBox box = (JComboBox)a1.getSource(); 		// ���������� ���������� box �������� JComboBox
                           String item = (String)box.getSelectedItem(); 	// ���������� ���������� item �������� box	
                              if(item == "���������� ����"){ 			// �������� ���������� ����������� ��������� ���������� if
                             	 Button1.addActionListener(bnds1); 		// ���������� ������� Button1 ��������� bnds1
                             	 Button1.removeActionListener(bnds); 	// ����������� ������������� ������ Button1 ���������� bnds
                             	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button1 ���������� snds
                             	 Button1.removeActionListener(snds1); 	// ����������� ������������� ������ Button1 ���������� snds1
                             	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button1 ���������� bnds2
                              }											// ����� ���������� �������� ��� ���������� ������� ��������� if   
                       else if(item == "�������������� ���������������"){// �������� ���������� ����������� ��������� ���������� else if
                             	 Button1.addActionListener(bnds); 		// ���������� ������� Button3 ��������� snds
                             	 Button1.removeActionListener(bnds1); 	// ����������� ������������� ������ Button3 ���������� bnds1                            	
                             	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button3 ���������� snds
                             	 Button1.removeActionListener(snds1); 	// ����������� ������������� ������ Button3 ���������� snds1
                             	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button3 ���������� bnds2
                              }											// ����� ���������� �������� ��� ���������� ������� ��������� else if
                              else if(item == ""){ 						// �������� ���������� ����������� ��������� ���������� else if
                              	 Button1.removeActionListener(bnds); 	// ���������� ������� Button3 ��������� snds
                              	 Button1.removeActionListener(bnds1); 	// ����������� ������������� ������ Button3 ���������� bnds1                            	
                              	 Button1.removeActionListener(snds); 	// ����������� ������������� ������ Button3 ���������� snds
                              	 Button1.removeActionListener(snds1); 	// ����������� ������������� ������ Button3 ���������� snds1
                              	 Button1.removeActionListener(bnds2); 	// ����������� ������������� ������ Button3 ���������� bnds2
                              };											// ����� ���������� �������� ��� ���������� ������� ��������� else if                                 
                     }													// ����� ������ actionPerformed    
                 };														// ����� ������ ��������� combob        
     	  final ActionListener combo = new ActionListener() {			// ���������� ��������� combob (��������� ������� ������ �� ������)
               public void actionPerformed(ActionEvent a2) {  			// ���������� ������ actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// ���������� ���������� box �������� JComboBox
                           String item = (String)box.getSelectedItem();  // ���������� ���������� item �������� box	
                           if(item == "� ���"){ 							// �������� ���������� ����������� ��������� ���������� if
                           comboBox2.setEnabled(true);					// ������� ������� comboBox2 � ��������� ��������� (��� �������) ������� setEnabled
                           comboBox4.addActionListener(combos1); 		// ���������� ������� comboBox4 ��������� combos1
                           comboBox.addActionListener(combos); 			// ���������� ������� comboBox ��������� combos
                           comboBox4.removeActionListener(combob1); 		// ����������� ������������� ������� comboBox4 ���������� combob1
                           comboBox.removeActionListener(combob); 		// ����������� ������������� ������� comboBox ���������� combob
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� if   
                           else if(item == "��� ���"){					// �������� ���������� ����������� ��������� ���������� else if
                           comboBox2.setEnabled(true);					// ������� ������� comboBox2 � ��������� ��������� (��� �������) ������� setEnabled
                           comboBox4.addActionListener(combob1); 		// ���������� ������� comboBox4 ��������� combob1
                           comboBox.addActionListener(combob); 			// ���������� ������� comboBox ��������� combob
                           comboBox4.removeActionListener(combos1); 		// ����������� ������������� ������� comboBox4 ���������� combos1
                           comboBox.removeActionListener(combos); 		// ����������� ������������� ������� comboBox ���������� combos
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� else if
                           else if(item == ""){ 							// �������� ���������� ����������� ��������� ���������� else if
                           comboBox2.setEnabled(false);					// ������� ������� comboBox2 � ����������� ��������� (��� �������) ������� setEnabled
                       	  comboBox2.setSelectedItem("");				// ���������� ������� comboBox2 �������� ������� ������� ����
                           comboBox4.removeActionListener(combob1); 		// ����������� ������������� ������� comboBox4 ���������� combob1
                           comboBox.removeActionListener(combob); 		// ����������� ������������� ������� comboBox ���������� combob
                           comboBox4.removeActionListener(combos1); 		// ����������� ������������� ������� comboBox4 ���������� combos1
                           comboBox.removeActionListener(combos); 		// ����������� ������������� ������� comboBox ���������� combos
                           comboBox2.setSelectedItem("");				// ���������� ������� comboBox2 �������� ������� ������� ����
                           };											// ����� ���������� �������� ��� ���������� ������� ��������� else if                                 
                  }														// ����� ������ actionPerformed    
              };															//����� ������ ��������� combo
     	  final ActionListener combobx = new ActionListener() {			// ���������� ��������� combob (��������� ������� ������ �� ������)
               public void actionPerformed(ActionEvent a2) {  			// ���������� ������ actionPerformed
                   JComboBox box = (JComboBox)a2.getSource(); 			// ���������� ���������� box �������� JComboBox
                           String item = (String)box.getSelectedItem();  // ���������� ���������� item �������� box
                           if(item == "����"){ 							// �������� ���������� ����������� ��������� ���������� if
                           	 comboBox4.setEnabled(false);				// ������� ������� comboBox4 � ����������� ��������� (��� �������) ������� setEnabled
                          	 comboBox4.setSelectedItem("");				// ���������� ������� comboBox4 �������� ������� ������� ����
                          	 Button1.addActionListener(bnds2); 			// ������������� ������� Button1 ��������� bnds2
                          	 Button1.removeActionListener(bnds); 		// ����������� ������������� ������ Button1 ���������� bnds
                          	 Button1.removeActionListener(snds); 		// ����������� ������������� ������ Button1 ���������� snds
                          	 Button1.removeActionListener(snds1); 		// ����������� ������������� ������ Button1 ���������� snds1
                          	 Button1.removeActionListener(bnds1); 		// ����������� ������������� ������ Button1 ���������� bnds2
                           }												// ����� ���������� �������� ��� ���������� ������� ��������� if   