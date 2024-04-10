import java.util.ArrayList;
import java.sql.*;
public class TransportManager {
    private ArrayList<Transport> transports = new ArrayList<>();

    // Method to add an employee
    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    // Method to display all employees
    public void displayAllEmployees() {
        for (Transport transport : transports) {
            transport.showInfo();
            System.out.println();
        }
    }

    // Method to find employee by ID
    public Transport findTransportByID(int id) {
        for (Transport transport : transports) {
            if (transport.getID() == id) {
                return transport;
            }
        }
        return null;
    }

    // Method to update employee information
    public void updateTransport(int id, String brand, String publishYear, String price, String color) {
        Transport transport = findTransportByID(id);
        if (transport != null) {
            transport.Brand= brand;
            transport.publishYear = publishYear;
            transport.Price = price;
            transport.Color = color;
            System.out.println("Transport information updated successfully.");
        } else {
            System.out.println("Transport not found.");
        }
    }
    public void deleteTransport(int id) {
        Transport transport = findTransportByID(id);
        if (transport != null) {
            transports.remove(transport);
            System.out.println("Transport deleted successfully.");
        } else {
            System.out.println("Transport not found.");
        }
    }
    public void writeToDatabase() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "11anhpham11";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO employee (ID, Brand, publishYear, Price, Color, Transport_type) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            for (Transport transport : transports) {
                preparedStatement.setInt(1, transport.ID);
                preparedStatement.setString(2, transport.Brand);
                preparedStatement.setString(3, transport.publishYear);
                preparedStatement.setString(4, transport.Price);
                preparedStatement.setString(5, transport.Color);
                preparedStatement.setString(6, transport.Transport_type);
                preparedStatement.executeUpdate();
            }
            System.out.println("Transport written to database successfully.");
        } catch (SQLException e) {
            System.out.println("Error writing transport to database: " + e.getMessage());
        }
    }
    public void readFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "11anhpham11";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM Transport";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String FullName = resultSet.getString("Brand");
                String BirthDay = resultSet.getString("publishYear");
                String Phone = resultSet.getString("Price");
                String Email = resultSet.getString("Color");
                String Employee_type = resultSet.getString("Transport_type");
                // Based on Employee_type, create corresponding Employee object
                // Add the created employee to employees list
            }
            System.out.println("Transport read from database successfully.");
        } catch (SQLException e) {
            System.out.println("Error reading transport from database: " + e.getSQLState());
        }
    }
}
