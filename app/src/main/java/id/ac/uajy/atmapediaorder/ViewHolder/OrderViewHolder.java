package id.ac.uajy.atmapediaorder.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import id.ac.uajy.atmapediaorder.Interface.ItemClickListener;
import id.ac.uajy.atmapediaorder.R;

public class OrderViewHolder extends RecyclerView.ViewHolder{

    public TextView txtOrderId, txtOrderStatus, txtOrderphone, txtOrderAddress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView){
        super(itemView);

        txtOrderAddress = itemView.findViewById(R.id.order_address);
        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrderphone = itemView.findViewById(R.id.order_address);

    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}
