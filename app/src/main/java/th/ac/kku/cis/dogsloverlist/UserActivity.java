package th.ac.kku.cis.dogsloverlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import th.ac.kku.cis.dogsloverlist.databinding.ActivityUserBinding;


public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){

            String name = intent.getStringExtra("name");
            String dog = intent.getStringExtra("dog");
            String country = intent.getStringExtra("country");
            String description = intent.getStringExtra("description");
            int imageid = intent.getIntExtra("imageid",R.drawable.a);

            binding.nameProfile.setText(name);
            binding.phoneProfile.setText(dog);
            binding.countryProfile.setText(country);
            binding.profileImage.setImageResource(imageid);


        }

    }
}