package code.blue.simpleretrofitrequest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private ArrayList<Quote> quotes = new ArrayList<>();
    private Context context;


    public CustomAdapter(Context context, ArrayList<Quote> quotes){
        this.quotes=quotes;
        this.context=context;
    }


    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new CustomAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder viewHolder, int i) {
            viewHolder.textViewQuotes.setText(quotes.get(i).getQuote());
            viewHolder.textViewAuthor.setText(quotes.get(i).getAuthor());
    }

    @Override
    public int getItemCount() {
        return  quotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewQuotes, textViewAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewQuotes = itemView.findViewById(R.id.text_view_quote);
            textViewAuthor = itemView.findViewById(R.id.text_view_author);
        }
    }
}
