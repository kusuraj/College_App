package com.example.collegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.collegeapp.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class homeFragment extends Fragment {
   private ImageSlider imageSlider;
   private ImageView map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        imageSlider = view.findViewById(R.id.imageslider);

        ArrayList<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel("https://images.hindustantimes.com/img/2022/01/04/1600x900/01_1641284725025_1641284734747.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://scontent-del1-1.xx.fbcdn.net/v/t1.6435-9/32670631_1731255120287729_2328357137585012736_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=Z829LA04RXQAX_sVoqD&_nc_ht=scontent-del1-1.xx&oh=00_AfC8AMjUi3qVOjllUbYR5v5csOgBsOEsMQ3_attjkr_z2Q&oe=63B8EA44", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://cache.careers360.mobi/media/colleges/reviews/2020/5/26/120272/gla1_1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gla.ac.in/Uploads/banner/53hbanner_hm-banner-1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gla.ac.in/images/admin-block.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gla.ac.in/uploads/SmallImages/436pg_1R6A1088.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.gla.ac.in/Uploads/largeImages/58al_DSC_0064-Copy.JPG", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://static.mediawire.in/pr/metadata/89938334/temp/GLA_Pic_1.png?id=18080?id=18080", ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        map= view.findViewById(R.id.mapgla);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        return view;

    }

    private void openMap() {
        Uri uri=Uri.parse("https://www.google.com/maps/place/GLA+University/@27.6056934,77.5911358,17z/data=!3m1!4b1!4m5!3m4!1s0x39736ce47bffc039:0xfe5fc3da92c6341!8m2!3d27.6056887!4d77.5933245");
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);
    }
}