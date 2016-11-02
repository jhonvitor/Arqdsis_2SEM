package br.usjt.arqdesis.clientep2.model;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

import br.usjt.arqdesis.clientep2.R;

/**
 * Created by asbonato on 9/19/16.
 */
public class Util {
    public static Drawable getDrawable(Activity context, String drawableName){
        //procurar a imagem por meio de reflection
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(drawableName);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
