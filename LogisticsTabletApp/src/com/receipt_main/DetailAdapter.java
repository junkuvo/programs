package com.receipt_main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tablet.R;
import com.receipt.Details;

public class DetailAdapter extends ArrayAdapter<String>{
	private final int rowResourceId;
    private final Context context;
    private final String[] Ids;
    
    private Details[] mDetails;
	
	public DetailAdapter(Context context, int resource,String[] objects, Details[] details) {
		super(context, resource,objects);
    	this.rowResourceId = resource;
    	this.context = context;
        this.Ids = objects;
        this.mDetails = details;
	}
	
	
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
   	
    	View rowView = null;
    	if (convertView == null) {
    		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    		rowView = inflater.inflate(rowResourceId, parent, false);
    	}else{
    		rowView = convertView;
    	}

//    	if(position % 2 == 0){
//    		rowView.setBackgroundColor(context.getResources().getColor(R.color.aliceblue));
//    	}else{
//    		rowView.setBackgroundColor(Color.WHITE);
//    	}
    	
    	int id = Integer.parseInt(Ids[position]);
    	
    	if(id < Ids.length){
    		Details di = mDetails[id];

    		TextView tv1 = (TextView) rowView.findViewById(R.id.textView5);
    		TextView tv = (TextView) rowView.findViewById(R.id.text1);
    		TextView tv2 = (TextView) rowView.findViewById(R.id.textView6);
    		TextView tv3 = (TextView) rowView.findViewById(R.id.textView7);
    		TextView tv4 = (TextView) rowView.findViewById(R.id.textView8);
    		tv1.setText(di.getReceiptLineNumber());
    		tv.setText(di.getSku());
    		tv2.setText(di.getDescription());
    		tv3.setText("：" + String.valueOf(di.getQtyExpected()));
    		tv4.setText("：" + String.valueOf(di.getQtyReceived()));

    		ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
    		int imageFileID = 0;

    		switch (Integer.parseInt(di.getStatus())){
    		case 0:
    			imageFileID = R.drawable.icon_awaiting2_small;
    			break;
    		case 5:
    			imageFileID = R.drawable.icon_receiving_small;
    			break;
    		case 9:
    			imageFileID = R.drawable.icon_instock_small;
    			break;
    		}
    		imageView.setImageResource(imageFileID);
    	}

		return rowView;
    }	
}
