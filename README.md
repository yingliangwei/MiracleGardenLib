# MiracleGardenLib
拒绝setContentView和findViewById，快速找到View

public class MainActivity extends MiracleGardenActivity<ActivityMainBinding> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.text.setText("MiracleGarden");
    }
}
