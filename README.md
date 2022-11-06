[![](https://jitpack.io/v/yingliangwei/MiracleGardenLib.svg)](https://jitpack.io/#yingliangwei/MiracleGardenLib)

# MiracleGardenLib
拒绝setContentView和findViewById，快速找到View
```
 implementation "com.github.yingliangwei:MiracleGardenLib:1.0"
```
```
public class MainActivity extends MiracleGardenActivity<ActivityMainBinding> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.text.setText("MiracleGarden");
    }
}
```
