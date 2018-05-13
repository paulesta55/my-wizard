import com.intellij.icons.AllIcons;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import org.jetbrains.annotations.NotNull;


public class MyModule extends ModuleType<MyModuleBuilder>{
    private static final String ID = "MyModule";

    public MyModule() {
        super(ID);
    }
    public static MyModule getInstance() {
        return (MyModule) ModuleTypeManager.getInstance().findByID(ID);
    }
    @NotNull
    @Override
    public MyModuleBuilder createModuleBuilder() {
        return new MyModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "My Module";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "This is dope!";
    }

    @Override
    public javax.swing.Icon getNodeIcon(@Deprecated boolean b) {
        return AllIcons.General.Information;
    }

}
