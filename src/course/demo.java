package course;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class demo extends JFrame {
	private Main main=new Main();
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("添加学生");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog student=new dialog(); //调用内部类dialog
			}});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("添加老师");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogteacher teacher=new dialogteacher(); //调用内部类dialogteacher
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("添加课程");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogcourse course=new dialogcourse();  //调用内部类dialogcourse
			}
		});
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("选课");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogselectcourse selectcourse=new dialogselectcourse(); //调用内部类dialogselectcourse
			}
		});
		
		
		contentPane.add(btnNewButton_2);
		
		JButton button_1 = new JButton("退课");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogdeletecourse deletecourse=new dialogdeletecourse(); //调用内部类dialogdeletecourse
				
			}
		});
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("输出选课列表");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print Print=new print(); //调用内部类print
			}
		});
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("输出人员列表");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print1 Print=new print1(); //调用内部类print1
			}
		});
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("保存选课列表");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("d:\\选课.txt");  
		        try {  
		            file.createNewFile(); // 创建文件  
		        } catch (IOException e1) {  
		            // TODO Auto-generated catch block  
		            e1.printStackTrace();  
		        }  
		  
		        // 向文件写入内容(输出流)  
		        String str = main.ListCourse1();  
		        byte bt[] = new byte[1024];  
		        bt = str.getBytes();  
		        try {  
		            FileOutputStream in = new FileOutputStream(file);  
		            try {  
		                in.write(bt, 0, bt.length);  
		                in.close();  
		                // boolean success=true;  
		                // System.out.println("写入文件成功");  
		            } catch (IOException e1) {  
		                // TODO Auto-generated catch block  
		                e1.printStackTrace();  
		            }  
		        } catch (FileNotFoundException e1) {  
		            // TODO Auto-generated catch block  
		            e1.printStackTrace();  
		        }  
			}
		});
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("保存人员列表");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("d:\\test.txt");  
		        try {  
		            file.createNewFile(); // 创建文件  
		        } catch (IOException e1) {  
		            // TODO Auto-generated catch block  
		            e1.printStackTrace();  
		        }  
		  
		        // 向文件写入内容(输出流)  
		        String str = main.ListStuff1();  
		        byte bt[] = new byte[1024];  
		        bt = str.getBytes();  
		        try {  
		            FileOutputStream in = new FileOutputStream(file);  
		            try {  
		                in.write(bt, 0, bt.length);  
		                in.close();  
		                // boolean success=true;  
		                // System.out.println("写入文件成功");  
		            } catch (IOException e1) {  
		                // TODO Auto-generated catch block  
		                e1.printStackTrace();  
		            }  
		        } catch (FileNotFoundException e1) {  
		            // TODO Auto-generated catch block  
		            e1.printStackTrace();  
		        }  
			}
		});
		contentPane.add(button_5);
	}
	public class dialogcourse extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private int number;
		private String courseName;
		private String place;
		private String time;
		private int credit;
		private String teacher;
		private JTextField textField_5;
		
		public dialogcourse() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel label = new JLabel("课程号");
				contentPanel.add(label);
			}
			{
				textField = new JTextField();
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("课程名称");
				contentPanel.add(label);
			}
			{
				textField_1 = new JTextField();
				contentPanel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel label = new JLabel("课程地点");
				contentPanel.add(label);
			}
			{
				textField_2 = new JTextField();
				contentPanel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblNewLabel = new JLabel("课程时间");
				contentPanel.add(lblNewLabel);
			}
			{
				textField_3 = new JTextField();
				contentPanel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel label = new JLabel("学分");
				contentPanel.add(label);
			}
			{
				textField_4 = new JTextField();
				contentPanel.add(textField_4);
				textField_4.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("教师");
				contentPanel.add(lblNewLabel_1);
			}
			{
				textField_5 = new JTextField();
				contentPanel.add(textField_5);
				textField_5.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							number=Integer.parseInt(textField.getText());
							courseName=textField_1.getText();
							place=textField_2.getText();
							time=textField_3.getText();
							credit=Integer.parseInt(textField_4.getText());
							teacher=textField_5.getText();
							main.AddCourse(new Course(number,courseName,place,time,credit,teacher));
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							textField_4.setText("");
							textField_5.setText("");
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
				setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				setVisible(true);
			}
		}
		
	}
	public class dialogteacher extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private int number=0;
		private String sex=null;
		private String name=null;
		private String course=null;


		public dialogteacher() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setLayout(new FlowLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			{
				JLabel lblNewLabel = new JLabel("编号");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				contentPanel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("姓名");
				contentPanel.add(label);
			}
			{
				textField_1 = new JTextField();
				contentPanel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel label = new JLabel("性别");
				contentPanel.add(label);
			}
			{
				textField_2 = new JTextField();
				contentPanel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel label = new JLabel("所授课程");
				contentPanel.add(label);
			}
			{
				textField_3 = new JTextField();
				contentPanel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							number=Integer.parseInt(textField.getText());
							name=textField_1.getText();
							sex=textField_2.getText();
							course=textField_3.getText();
							main.AddStaff(new Teacher(number,name,sex,course));
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}
	public class dialog extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private int number=0;
		private String sex=null;
		private String name=null;

		public dialog() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setLayout(new FlowLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			{
				JLabel lblNewLabel = new JLabel("学号");
				contentPanel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("姓名");
				contentPanel.add(label);
			}
			{
				textField_1 = new JTextField();
				contentPanel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel label = new JLabel("性别");
				contentPanel.add(label);
			}
			{
				textField_2 = new JTextField();
				contentPanel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				String[] sex = { "男", "女" };
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							number=Integer.parseInt(textField.getText());
							name=textField_1.getText();
							sex=textField_2.getText();
							main.AddStaff(new Student(number,name,sex));
							textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	 
	}
	public class dialogdeletecourse extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private int index;


		public dialogdeletecourse() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel lblNewLabel = new JLabel("课程编号");
				contentPanel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							index=Integer.parseInt(textField.getText());
							main.Delete(index);
							textField.setText("");
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}
	public class dialogselectcourse extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextField textField;
		private String student;
		private int index;
		private JTextField textField_1;


		public dialogselectcourse() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel label = new JLabel("学生姓名");
				contentPanel.add(label);
			}
			{
				textField = new JTextField();
				contentPanel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("课程编号");
				contentPanel.add(label);
			}
			{
				textField_1 = new JTextField();
				contentPanel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							student=textField.getText();
							index=Integer.parseInt(textField_1.getText());
							main.Select(index,student);
							textField.setText("");
							textField_1.setText("");
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}


	}
	public class print extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextArea textArea;

		public print() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

			{
				JTextArea textArea = new JTextArea();
				textArea.setText(main.ListCourse1());
				contentPanel.add(textArea);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textArea.setText(""); 
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}

	}
	public class print1 extends JDialog {

		private final JPanel contentPanel = new JPanel();
		private JTextArea textArea;

		public print1() {
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(new BorderLayout());
			contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JTextArea textArea = new JTextArea();
				textArea.setText(main.ListStuff1());
				contentPanel.add(textArea);
			}
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setVisible(true);
		}

	}
}
