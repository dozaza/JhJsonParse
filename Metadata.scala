import com.google.gson.annotations.SerializedName

/**
 * Created with IntelliJ IDEA.
 * System: Ubuntu
 * User: baoan @datayes
 * Date: 10/4/13
 * Time: 6:01 PM
 */

class Metadata {
  @SerializedName("metadata_nb.title.unique")
  private var title_unique = 0
  @SerializedName("metadata_nb.h2.unique")
  private var h2_unique = 0
  @SerializedName("metadata_nb.h1.not_filled")
  private var h1_n_filled = 0
  @SerializedName("metadata_nb.title.filled")
  private var title_filled = 0
  @SerializedName("metadata_nb.h1.filled")
  private var h1_filled = 0
  @SerializedName("metadata_nb.description.not_filled")
  private var desc_n_filled = 0
  @SerializedName("metadata_nb.h2.filled")
  private var h2_filled = 0
  @SerializedName("metadata_nb.not_enough")
  private var n_enough = 0
  @SerializedName("metadata_nb.description.filled")
  private var desc_filled = 0
  @SerializedName("metadata_nb.h2.not_filled")
  private var h2_n_filled = 0
  @SerializedName("metadata_nb.description.unique")
  private var desc_unique = 0
  @SerializedName("metadata_nb.h1.unique")
  private var h1_unique = 0
  @SerializedName("metadata_nb.title.not_filled")
  private var title_n_filled = 0

  def getTitle_unique = title_unique
  def setTitle_unique(title_unique: Int) = {this.title_unique = title_unique}

  def getH2_unique = h2_unique
  def setH2_unique(h2_unique: Int) = {this.h2_unique = h2_unique}

  def getH1_n_filled = h1_n_filled
  def setH1_n_filled(h1_n_filled: Int) = {this.h1_n_filled = h1_n_filled}

  def getTitle_filled = title_filled
  def setTitle_filled(title_filled: Int) = {this.title_filled = title_filled}

  def getH1_filled = h1_filled
  def setH1_filled(h1_filled: Int) = {this.h1_filled = h1_filled}

  def getDesc_n_filled = desc_n_filled
  def setDesc_n_filled(desc_n_filled: Int) = {this.desc_n_filled = desc_n_filled}

  def getH2_filled = h2_filled
  def seth2_filled(h2_filled: Int) = {this.h2_filled = h2_filled}

  def getN_enough = n_enough
  def setN_enough(n_enough: Int) = {this.n_enough = n_enough}

  def getDesc_filled = desc_filled
  def setDesc_filled(desc_filled: Int) = {this.desc_filled = desc_filled}

  def getH2_n_filled = h2_n_filled
  def setH2_n_filled(h2_n_filled: Int) = {this.h2_n_filled = h2_n_filled}

  def getDesc_unique = desc_unique
  def setDesc_unique(desc_unique : Int) = {this.desc_unique = desc_unique}

  def getH1_unique = h1_unique
  def setH1_unique(h1_unique: Int) = {this.h1_unique = h1_unique}

  def getTitle_n_filled = title_n_filled
  def setTtile_n_filled(title_n_filled: Int) = {this.title_n_filled = title_n_filled}


}
