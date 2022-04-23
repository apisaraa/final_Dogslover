package th.ac.kku.cis.dogsloverlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

import th.ac.kku.cis.dogsloverlist.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.a, R.drawable.golden, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h};
        String[] name = {"American Bully", "golden", "Boxer", "German Shepherd", "Jack russell", "Labrador", "Poodle", "Pug"};
        String[] id = {"001", "002", "003", "004", "005", "006", "007", "008"};
        String[] time = {"8:24", "9:09", "1:45", "2:00", "4:00", "3:15", "13:57", "16:27"};
        String[] dogNo = {"496", "034", "281", "934", "773", "041", "536", "791"};
        String[] country = {"สุนัขสายพันธุ์นี้เกิดขึ้นในช่วงศตวรรษที่ 19 โดยผสมข้ามสายพันธุ์ระหว่าง สายพันธุ์บูลด๊อก กับ สายพันธุ์เทอร์เรีย กลายมาเป็น บูลแอนด์เทอร์เรีย (Bull-and-Terrier) ต่อมามีการอพยพ นำไปยัง สหรัฐอเมริกา จึงกลายมาเป็นที่มาของชื่อ อเมริกันพิทบูล แบ่งออกเป็นสองสายหลัก คือ สายกัด และ สายโชว์ "
                , "หมาโกลเด้น"
                , "ในช่วงก่อนศตวรรษที่ 20 สุนัขพันธุ์บ็อกเซอร์ ได้ถูกนำเข้ามาเลี้ยงในสหรัฐอเมริกา และได้รับการขึ้นทะเบียนสายพันธุ์จากสมาคม The American Kennel Club (AKC) ในปี ค.ศ. 1904 โดยหลังสงครามโลกครั้งที่ 1 (World War I) ทหารอเมริกาได้นำสุนัขพันธุ์บ็อกเซอร์มาเป็นสุนัขทหาร จัดเป็นหนึ่งในสายพันธุ์แรกที่ได้รับการคัดเลือก "
                , "รู้จักกันในชื่ออัลเซเชี่ยน (เยอรมัน : Deutscher Schäferhund) เป็นสุนัขสายพันธุ์ขนาดใหญ่ที่มีต้นกำเนิดมาจากประเทศเยอรมนี เยอรมันเชพเพิร์ดเป็นสุนัขสายพันธุ์ที่ค่อนข้างใหม่ มีต้นกำเนิดมาตั้งแต่ปี ค.ศ. 1899 โดยจัดอยู่ในกลุ่มของสุนัขต้อนสัตว์และถูกพัฒนาขึ้นมาเพื่อต้อนแกะ "
                , "คาดว่ามีต้นกำเนิดมากจากประเทศอังกฤษ ในช่วงปี 1800 โดยนักเพาะพันธุ์สุนัขที่มีชื่อเสียงในสมัยนั้นที่ชื่อว่า Parson John Russell เพื่อใช้ในการล่าสุนัขจิ้งจอก โดยคำว่า รัสเซล หมายถึง นักล่าจิ้งจอกตัวยง"
                , "(เรียกสั้น ๆ ว่า แลป) มีถิ่นกำเนิดมาจากเกาะนิวฟันด์แลนด์ (Newfoundland) ของประเทศแคนนาดา และมีชื่อดั้งเดิมว่า เซนต์ จอห์น (St. John's) พวกมันเป็นสัตว์เลี้ยงที่เลี้ยงกันในภายในครอบครัว โดยเฉพาะในครอบครัวชาวประมง เพราะลาบราดอร์สามารถช่วยชาวประมงในการจับปลา ฉลาดมากพอที่จะปลดตะขออกจากปลาและแข็งแกร่ง"
                , "มีแนวคิดว่าสุนัขสายพันธุ์ พุดเดิ้ล (Poodle) มาจากทวีปเอเชีย และหลังจากนั้นหลายศตวรรษต่อมาก็ได้มีการตั้งรกรากในประเทศเยอรมนี โดยในศตวรรษที่ 15 พุดเดิ้ลกลายเป็นหนึ่งในสายพันธุ์ที่ได้รับความนิยมมากที่สุดในฝรั่งเศส ซึ่งมักมีเพียงราชวงศ์และขุนนางเท่านั้นที่เป็นเจ้าของสุนัขพันธุ์นี้"
                , "แม้หลายคนมีความเชื่อว่าปั๊กถือกำเนิดมาจากประเทศฮอลแลนด์ แต่ถิ่นกำเนิดที่แท้จริงคือในประเทศจีนโดยอาจมีการผสมพันธุ์สุนัขตระกูลแมสทิฟซึ่งเป็นสุนัขท้องถิ่น จากนั้นเจ้าหัวกลมและและหน้าย่นจึงถูกส่งไปฮอลแลนด์ทางเรือการค้าของชาวดัตช์ บริษัท ดัช อีสท์ อินเดีย คอมพานี ในปี 1572 ปั๊กได้ช่วยเจ้าเพศผู้วิลเลียมจากทหารสเปน"};


        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i = 0; i < imageId.length; i++) {

            User user = new User(name[i], id[i], time[i], dogNo[i], country[i], imageId[i]);
            userArrayList.add(user);

        }


        ListAdapter listAdapter = new ListAdapter(MainActivity.this, userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, UserActivity.class);
                i.putExtra("name", name[position]);
                i.putExtra("dog", dogNo[position]);
                i.putExtra("country", country[position]);
                i.putExtra("imageid", imageId[position]);
                startActivity(i);

            }
        });

    }
}