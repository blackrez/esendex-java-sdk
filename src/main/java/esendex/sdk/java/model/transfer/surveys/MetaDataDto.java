package esendex.sdk.java.model.transfer.surveys;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import esendex.sdk.java.model.transfer.Dto;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("metadata")
public class MetaDataDto extends Dto {

    @XStreamImplicit(itemFieldName = "metadataitem")
    private List<MetaDataItemDto> metaData = new ArrayList();

    public void setMetaData(List<MetaDataItemDto> metaData) {
        this.metaData = metaData;
    }
}
