package be.crydust.primefaces_issues_70;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@RequestScoped
public class TestBean implements Serializable {

    private String selectedPk;

    private static final List<NamePk> items = Arrays.asList(
            new NamePk("Widget <widget>", "1"),
            new NamePk("<b>Bold widget</b>", "2"),
            new NamePk("kein XML", "3")
//            ,
//            new NamePk("</li></ul></div></div> issue 70 is not fixed if this text is not within a selectbox", "4"),
//            new NamePk("</option></select></div> issue 70 is not fixed if this text is not within a selectbox", "5"),
//            new NamePk("<script>alert('issue 70 is not fixed if this alert is shown');</script>", "6"),
//            new NamePk("<plaintext>issue 70 is not fixed if this text is not within a selectbox", "7")
    );

    public List<NamePk> getItems() {
        return items;
    }

    public List<SelectItem> getItemsAsSelectItems() {
        List<SelectItem> selectItems = new ArrayList<>();
        for (NamePk item : items) {
            selectItems.add(new SelectItem(item.getPk(), item.getName()));
        }
        return selectItems;
    }

    public String getSelectedPk() {
        return selectedPk;
    }

    public void setSelectedPk(String selectedPk) {
        this.selectedPk = selectedPk;
    }
}
