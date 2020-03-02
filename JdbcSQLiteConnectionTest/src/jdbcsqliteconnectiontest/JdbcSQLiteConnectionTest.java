package jdbcsqliteconnectiontest;

import java.sql.DriverManager;//���������� �������� ���������
import java.sql.Connection;//��������� ���������� ��
import java.sql.Statement;//��� �������� select (update)
import java.sql.CallableStatement;//��� ������ � ��
import java.sql.ResultSet;//��������� ���������� �������
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//select
public class JdbcSQLiteConnectionTest {


    public static void main(String[] args) 
    {
      //��� 1 ���������� ������� +
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
              //��� 2 ��������������� ������
              //����� ��������
            Class.forName("org.sqlite.JDBC");
            //
            Connection connection = null;
            //jdbc:sqlite:C:\\��� ����� � �������\\test.db"
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:C:\\MyData\\test.db");
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(
            "SELECT ORDER_ID ,PRODUCT_ID ,CUSTOMER_NAME ,PURCHASE_DATE ,amount from ORDERS");
            int num = 0;
            //5.�������� ����� �������
                while (rs.next()) {
                    //������ ������ �� �������� �����
                  int ORDER_ID = rs.getInt("ORDER_ID");
                  String CUSTOMER_NAME = rs.getString("CUSTOMER_NAME");
                  int PRODUCT_ID = rs.getInt("PRODUCT_ID");
                  //d - decimal s - string  f - float
                  String result = 
              String.format("id = %d, name=%s, idcode=%s",ORDER_ID,CUSTOMER_NAME,PRODUCT_ID );
                System.out.println(result);
                }
            //
        } catch (ClassNotFoundException ex) {
            System.out.println("����� org.sqlite.JDBC JDBC �� ������ � ����� sqlite-jdbc-3.8.11.2.jar");
        } catch (SQLException ex) {
           System.out.println("������ � �������. �����������:"+ex);
        }
    }
    
}
