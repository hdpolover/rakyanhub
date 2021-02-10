package com.polover.hubrakyran;

import android.graphics.ColorSpace;

import java.util.ArrayList;

public class PostData {
    public static String[] displayNames = {
            "Max Mooney",
            "Olga Lee",
            "Nora Travis",
            "Isaac Walton",
            "Bert Hardy"
    };

    public static String[] postTimes = {
            "Just now",
            "1 hour ago",
            "3 hours ago",
            "8 hours ago",
            "A week ago"
    };

    public static String[] posDescs = {
            "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?",
            "Sed ut perspiciatis unde omnis iste natus error sit voluptatem",
            "Accusantium doloremque laudantium",
            "Totam rem aperiam, eaque ipsa quae",
            "Natus error"
    };

    public static int[] userPics = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5
    };

    public static int[] postPics = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5
    };

    static ArrayList<ModelPost> getPostData() {
        ArrayList<ModelPost> postList = new ArrayList<>();

        for (int i = 0; i < displayNames.length; i++){
            ModelPost post = new ModelPost();

            post.setDisplayName(displayNames[i]);
            post.setProfilePic(userPics[i]);
            post.setPostTime(postTimes[i]);
            post.setDescription(posDescs[i]);
            post.setPostPic(postPics[i]);

            postList.add(post);
        }

        return postList;
    }

}
