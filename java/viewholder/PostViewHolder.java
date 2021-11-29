package com.JJProject.java.viewholder;

import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.JJProject.java.models.Post;

import java.io.ByteArrayInputStream;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public ImageView starView;
    public TextView numStarsView;
    public TextView bodyView;
    public ImageView imageView;

    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.postTitle);
        authorView = itemView.findViewById(R.id.postAuthor);
        starView = itemView.findViewById(R.id.star);
        numStarsView = itemView.findViewById(R.id.postNumStars);
        bodyView = itemView.findViewById(R.id.postBody);
        imageView = itemView.findViewById(R.id.iv);
    }

    public static byte[] binaryStringToByteArray(String s) {
        int count = s.length() / 8;
        byte[] b = new byte[count];
        for (int i = 1; i < count; ++i) {
            String t = s.substring((i - 1) * 8, i * 8);
            b[i - 1] = binaryStringToByte(t);
        }
        return b;
    }

    public static byte binaryStringToByte(String s) {
        byte ret = 0, total = 0;
        for (int i = 0; i < 8; ++i) {
            ret = (s.charAt(7 - i) == '1') ? (byte) (1 << i) : 0;
            total = (byte) (ret | total);
        }
        return total;
    }

    public void bindToPost(Post post, View.OnClickListener starClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numStarsView.setText(String.valueOf(post.starCount));
        bodyView.setText(post.body);

        byte[] b = binaryStringToByteArray(post.image);
        ByteArrayInputStream is = new ByteArrayInputStream(b);
        Drawable reviewImage = Drawable.createFromStream(is, "reviewImage");

        imageView.setImageDrawable(reviewImage);

        starView.setOnClickListener(starClickListener);
    }
}
