package com.example.selectionlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.selectionlayout.view.SelectionLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectionLayout.OnSelectListener {
    protected List<List<String>> list;

    protected List<List<String>> list1 = new ArrayList<List<String>>() {{
        add(new ArrayList<String>() {{
            add("全部");
            add("精品");
        }});
        add(new ArrayList<String>() {{
            add("默认排序");
            add("最新发布");
            add("最多评论");
        }});
    }};

    protected List<List<String>> list2 = new ArrayList<List<String>>() {{
        add(new ArrayList<String>() {{
            add("全部");
            add("精品");
        }});
        add(new ArrayList<String>() {{
            add("全部类型");
            add("玄幻奇幻");
            add("武侠仙侠");
            add("都市异能");
            add("历史军事");
            add("游戏竞技");
            add("科幻灵异");
            add("穿越架空");
            add("豪门总裁");
            add("现代言情");
            add("古代言情");
            add("幻想言情");
            add("耽美同人");
        }});
        add(new ArrayList<String>() {{
            add("默认排序");
            add("最新发布");
            add("最多评论");
            add("最有用的");
        }});
    }};

    private SelectionLayout slOverall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slOverall= (SelectionLayout) findViewById(R.id.slOverall);
        if (slOverall != null) {
            slOverall.setData(list1.toArray(new List[list1.size()]));
            slOverall.setOnSelectListener(this);
        }

    }

    @Override
    public void onSelect(int index, int position, String title) {
        switch (index) {
            case 0:
                switch (position) {
                    case 0:
                        //distillate = "";
                        Toast.makeText(this,"0 0",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                      //  distillate = "true";
                        Toast.makeText(this,"0 1",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                if (list1.size() == 2) {
                   // sort = Constant.sortTypeList.get(position);
                    Toast.makeText(this,"1 2",Toast.LENGTH_LONG).show();
                } else if (list1.size() == 3) {
                  //  type = Constant.bookTypeList.get(position);
                    Toast.makeText(this,"1 3",Toast.LENGTH_LONG).show();
                }
                break;
            case 2:
              //  sort = Constant.sortTypeList.get(position);
                Toast.makeText(this,"2",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
