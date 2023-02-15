package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class aboutFragment extends Fragment {
private ViewPager viewPager;
private BranchAdapter adapter;
private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();

        list.add(new BranchModel(R.drawable.ic_computer,"Computer Science","CSE students learn how to design, develop and test algorithms, software, develop effective solutions to computing problems in various social."));
        list.add(new BranchModel(R.drawable.ic_machnical,"Machanical Engineering","The department of mechanical engineering utilizes knowledge of mathematics, science, and engineering for solution for mechanical engineering problem. "));
        list.add(new BranchModel(R.drawable.ic_computer,"Civil Science","Civil Engineering is concerned with improvement in the quality of basic needs of human civilization and taking care of the naturally and humanly built environments with their planning, designing, construction, operation and maintenance."));
        list.add(new BranchModel(R.drawable.ic_computer,"Electrical Science","Electrical engineering deals with generation, transmission and distribution of electricity. Job opportunities are ample in both private and public sectors like railways, civil aviation, electricity board and utility companies, electrical design and consultancy firms and all types of manufacturing industries."));
        list.add(new BranchModel(R.drawable.ic_computer,"Electrical & Electronics Science","Electrical Engineering is one of the fastest growing fields that involves the study and application of electricity and electronics."));
        adapter = new BranchAdapter(getContext(),list);

        viewPager =view.findViewById(R.id.viewPger);


        viewPager.setAdapter(adapter);
        ImageView imageView= view.findViewById(R.id.college_image);
        Picasso.get().load("https://static.mediawire.in/pr/metadata/89938334/temp/GLA_Pic_1.png?id=18080?id=18080").into(imageView);


        return  view;
    }
}