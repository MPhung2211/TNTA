/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import ntmp.Question;
import org.junit.jupiter.api.Test;
import ktpm.QuestionServicesjava;

public class QuestionTest {
    @Test
    public void test(){
        QuestionServicesjava s = new QuestionServicesjava();
        try {
        List<Question> questions = s.getQuestions(2);
        Assertions
        } catch (SQLException ex){
            Logger.getLogger(QuestionTest.class.getName()).log(Lever.SEVERE, null, ex);
        }
    }
}
