/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import java.util.HashMap;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import modelo.Carro;


/**
 *
 * @author DGTALE
 */
@FacesConverter("carroConverter")
public class CarroConverter implements Converter{
 private static Map<String, Carro> map = new HashMap<String, Carro>();
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
         return map.get(value);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {
          if (value instanceof Carro) {
            Carro c = (Carro) value;
            map.put(String.valueOf(c.getIdCarro()), c);
            return String.valueOf(c.getIdCarro());
        } else {
            return "";
        }

    }
    
}
