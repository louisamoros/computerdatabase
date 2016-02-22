package com.louisamoros.cdb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.louisamoros.cdb.dao.exception.DaoException;

/**
 * <ConnectionCloser> class is used to close (via static methods) a <Connection>, <PreparedStatement> nor <ResultSet>.
 * @author louis
 *
 */
public class ConnectionCloser {

	/**
	 * Close in a try catch all the given parameters and throw new <DaoException> with given message.
	 * @param <ResultSet>
	 * @param <PreparedStatement>
	 * @param <Connection>
	 * @param message
	 */
	public static void close(ResultSet rs, PreparedStatement ps, Connection conn, String message) {
		try {
			if(rs != null) {
				rs.close();				
			}
			if(ps != null) {
				ps.close();				
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			throw new DaoException("Fail when closing after: " + message, e);
		}
	}
	
}
