package rms.view.item;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import javax.swing.JPanel;

/**
 *
 * @author Timothy
 */
public class BaseItemPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public BeanDescriptor getBeanDescriptor() {
        BeanDescriptor desc = new BeanDescriptor(BaseItemPanel.class);
        desc.setValue("isContainer", Boolean.TRUE);
        desc.setValue("containerDelegate", "getInnerContentPanel");
        return desc;
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return super.getPropertyDescriptors();
    }

    @Override
    public BeanInfo[] getAdditionalBeanInfo() {
        try {
            return new BeanInfo[]{Introspector.getBeanInfo(JPanel.class)};
        } catch (IntrospectionException ex) {
            return super.getAdditionalBeanInfo();
        }
    }
}
