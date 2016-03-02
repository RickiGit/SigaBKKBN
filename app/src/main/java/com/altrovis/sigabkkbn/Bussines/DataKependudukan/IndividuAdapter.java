package com.altrovis.sigabkkbn.Bussines.DataKependudukan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.altrovis.sigabkkbn.ActivityEditIndividu;
import com.altrovis.sigabkkbn.Entities.GlobalVariable;
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
    public View getView(final int position, View view, ViewGroup viewGroup){

        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view =  inflater.inflate(resource, viewGroup,false);
        }

        TextView textViewNama = (TextView)view.findViewById(R.id.TextViewNama);

        final IndividuKeluarga individu = listOfIndividu.get(position);
        textViewNama.setText(individu.getNama());

        ImageButton imageButtonHapus = (ImageButton)view.findViewById(R.id.ImageButtonDelete);
        imageButtonHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listOfIndividu.remove(position);
                notifyDataSetChanged();
            }
        });

        ImageButton imageButtonEdit = (ImageButton)view.findViewById(R.id.ImageButtonEdit);
        imageButtonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalVariable.SELECTED_INDIVIDU = listOfIndividu.get(position);
                Intent intent = new Intent(context, ActivityEditIndividu.class);
                context.startActivity(intent);
            }
        });

        return view;
    }

}
