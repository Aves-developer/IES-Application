package com.ashokit.ies.admin.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
@Component
public class ApplicationGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		String prefix = "AppNo_";
		String suffix = "";
		try {
	         Connection con=session.connection();
			Statement stmt= con.createStatement();
			String sql="select AR_Seq_Gen.nextval from dual";
		ResultSet rs =	stmt.executeQuery(sql);
		if(rs.next()) {
		int seqval=	rs.getInt(1);
		suffix=String.valueOf(seqval);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix ;
	}

}
