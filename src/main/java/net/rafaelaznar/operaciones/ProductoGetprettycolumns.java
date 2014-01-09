/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.operaciones;

import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.rafaelaznar.dao.ProductoDao_Mysql;
import net.rafaelaznar.data.MysqlData;

/**
 *
 * 
 */
public class ProductoGetprettycolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String data = "{\"data\": [\"id\", \"codigo\", \"descripcion\", \"precio\", \"id_tipoproducto\"]}";
            return data;
        } catch (Exception e) {
            throw new ServletException("ProductoGetpagesJson: View Error: " + e.getMessage());
        }
    }
}
