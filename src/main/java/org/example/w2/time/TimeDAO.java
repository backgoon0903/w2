package org.example.w2.time;

import lombok.Cleanup;
import org.example.w2.common.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public enum TimeDAO {
    INSTANCE;

    public String getNow()throws Exception {

        String query = "select now()";

        //템플릿 메소드 패턴

        @Cleanup Connection con = ConnectionUtil.INSTANCE.getDs().getConnection();
        @Cleanup PreparedStatement ps = con.prepareStatement(query);
        @Cleanup ResultSet rs = ps.executeQuery();

        rs.next();
        return rs.getString(1);

    }
}