 package com.farmerProject.insurancePages;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Insurance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insurance frame = new Insurance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Insurance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Bidding");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(29, 47, 186, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insurance");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(266, 47, 186, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(" Logout ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(978, 47, 186, 43);
		contentPane.add(btnNewButton_2);
		
		
		
		
		JButton btnNewButton_3 = new JButton("Apply for a policy ");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsuranceApplication application = new InsuranceApplication();
			 
				application.setVisible(true);
			 
			}
		});
		btnNewButton_3.setBounds(472, 228, 295, 59);
		contentPane.add(btnNewButton_3);
		
		
		
		
		
		JButton btnNewButton_4 = new JButton("Claim Insurance ");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsuranceClaimForm claimapplication = new InsuranceClaimForm();
			 
				claimapplication.setVisible(true);
			 
			}
		});
		btnNewButton_4.setBounds(472, 309, 295, 59);
		contentPane.add(btnNewButton_4);
		
		
		
		
		JButton btnNewButton_5 = new JButton("Place Sell Request ");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(57, 456, 345, 56);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("View Sold Crop History ");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(57, 546, 345, 59);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("View Marketplace ");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(57, 639, 345, 59);
		contentPane.add(btnNewButton_7);
	}
}
