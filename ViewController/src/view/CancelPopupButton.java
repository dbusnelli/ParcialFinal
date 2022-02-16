package view;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;

public class CancelPopupButton {
    
    //TO DO: hacer funcionar el backing bean para que cierre el popup
    
    private RichPopup myPopup;
    
    public void infoPopupDialogListener(DialogEvent dialogEvent) {
        myPopup.hide();
    }
}
