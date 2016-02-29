package com.altrovis.sigabkkbn.Bussines.DataKependudukan;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.altrovis.sigabkkbn.Entities.IndividuKeluarga;
import com.altrovis.sigabkkbn.R;

import java.util.ArrayList;

/**
 * Created by ricki on 2/29/2016.
 */
public class IndividuAdapter extends ArrayAdapter<IndividuKeluarga> {

    Context context;
    int resource;
    ArrayList<IndividuKeluarga> listOfIndividu;

    public IndividuAdapter(Context context, int resource, ArrayList<IndividuKeluarga> listOfIndividu) {
        super(context, resource, listOfIndividu);

        this.context = context;
        this.resource = resource;
        this.listOfIndividu = listOfIndividu;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){

        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view =  inflater.inflate(resource, viewGroup,false);
        }

        TextView textViewNama = (TextView)view.findViewById(R.id.TextViewNama);

        IndividuKeluarga individu = listOfIndividu.get(position);
        textViewNama.setText(individu.getNama());

        return view;
    }

}
