package esendex.sdk.java.model.transfer.surveys;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import esendex.sdk.java.model.transfer.Dto;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("metadata")
public class MetaDataDto extends Dto {

    @XStreamImplicit(itemFieldName = "metadata")
    private List<MetaDatumDto> metaData = new ArrayList();

    public void setMetaData(List<MetaDatumDto> metaData) {
        this.metaData = metaData;
    }
}
