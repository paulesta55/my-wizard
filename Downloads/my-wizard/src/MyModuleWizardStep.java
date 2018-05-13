import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class MyModuleWizardStep extends ModuleWizardStep {
    @Override
    public JComponent getComponent() {
        return new JLabel("Test Label");
    }

    @Override
    public void updateDataModel() {

    }
}
