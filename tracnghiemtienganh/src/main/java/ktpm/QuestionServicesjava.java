/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktpm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ntmp.JdbcUtils;
import ntmp.Question;

/**
 *
 * @author admin
 */
public class QuestionServicesjava{
    public List<Question> getQuestions(int limit) throws SQLException {
        List<Question> results = new ArrayList<>();
        try (Connection conn = JdbcUtils.getConn()){
            String sql = "SELECT * FROM question LIMIT ?";
            PreparedStatement stm = conn.prepareCall(sql);
            stm.setInt(1, limit);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
            Question q = new Question(rs.getString("id"), rs.getString("content"), rs.getInt("Category_id"));
            
            results.add(q);
        }
        };
    }
}
