package org.example.w2.bmi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(value = {"/bmi"})
public class BMIController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.getRequestDispatcher("/WEB-INF/bmiInput.jsp").forward(req, resp);
        }catch(Exception e) {
            e.printStackTrace();//debug
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.getRequestDispatcher("/WEB-INF/bmiResult.jsp").forward(req, resp);
        }catch(Exception e) {
            e.printStackTrace();//debug
        }
    }
}