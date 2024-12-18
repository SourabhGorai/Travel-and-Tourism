import javax.swing.*;
import javax.swing.plaf.ScrollBarUI;

import java.awt.*;
import java.awt.event.*;

public class about extends JFrame {

    String usrn;

    about(String usrn) {

        this.usrn = usrn;

        setTitle("ABOUT");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 100, 1000, 650);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** JLabel

        String s = """
                Overview
                The Travel and Tourism Management System (TTMS) is a comprehensive software solution designed to streamline and enhance the operations of travel agencies and tourism companies. This system integrates various functionalities, allowing users to manage bookings, customer details, packages, payments, and more. It aims to improve efficiency, reduce manual errors, and provide a seamless experience for both administrators and customers.

                Features
                User Dashboard

                A user-friendly dashboard providing quick access to various modules and functionalities.
                Real-time updates and notifications for bookings, payments, and inquiries.
                Customer Management

                Add, update, view, and delete personal details of customers.
                Maintain a comprehensive database of customer information for personalized services.
                Package Management

                Create, update, and view various travel packages.
                Provide detailed information about each package, including itinerary, price, and inclusions.
                Hotel Management

                View available hotels, book hotels, and manage hotel reservations.
                Integration with hotel databases for real-time availability and booking confirmation.
                Booking and Reservations

                Simplified booking process for travel packages and hotels.
                Automated confirmation and notification system for bookings.
                Payment Integration

                Secure payment processing through integrated payment gateways like Paytm.
                Manage payment records, track transactions, and generate invoices.
                Destination Information

                Provide detailed information about various travel destinations.
                Integrate with external resources for up-to-date information on attractions, weather, and more.
                Administrative Tools

                Access to calculators, notepads, and other utilities for daily operations.
                Detailed reporting and analytics for business insights.
                User Authentication and Security

                Secure login system for administrators and customers.
                Role-based access control to ensure data privacy and security.
                Technical Specifications
                Front-end: Java Swing for a robust and interactive graphical user interface.
                Back-end: MySQL database for secure and efficient data storage and retrieval.
                Payment Gateway: Integration with Paytm for seamless payment processing.
                Additional Tools: Integration with external tools like calculators and notepads to aid daily operations.
                Benefits
                Improved Efficiency:

                Automation of routine tasks like bookings, customer management, and payments reduces manual effort and increases operational efficiency.
                Enhanced Customer Experience:

                A user-friendly interface and personalized services enhance the overall experience for customers, leading to higher satisfaction and repeat business.
                Data Accuracy:

                Centralized data management ensures accuracy and consistency in customer and booking records.
                Scalability:

                The system is designed to handle an increasing number of users and transactions, making it scalable as the business grows.
                Security:

                Robust security features ensure that customer data and transactions are protected against unauthorized access and fraud.
                """;

        JLabel text = new JLabel("ABOUT");
        text.setBounds(450, 30, 350, 30);
        text.setForeground(new Color(255, 128, 0));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        // ***************************************************** Text Area

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(90, 100, 800, 450);
        add(area);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new about("admin");
    }
}
