package starter.userinterfaces.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
    public static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("#searchbox_input");

}
