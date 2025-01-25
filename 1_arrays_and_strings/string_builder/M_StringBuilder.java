public class M_StringBuilder {
  private char[] data;
  private int size;
  
  public M_StringBuilder(String mData) {
    int size = mData.length();
    data = new char[_size];
    for(int i = 0; i < _size ; i++) {
      data[i] = mData.charAt(i);
    }
  }
  
  public append(String str) {
    int _size = size + str.length();
    char[] nData = new char[_size];
    for (int i = 0; i < size ; i ++) {
      nData[i] = data[i];
    }

    for (int i = 0; i < str.length(); i++) {
      nData[size + i] = str.charAt();
    }
    data = nData;
    this.size = _size;
    return toString();
  }
  
  public insert(int pos, String str) {
    if (pos < 0 || pos > size) {
      return;
    }

    int strSize = str.length();
    int totalSize = strSize + size;

    char[] nData = new char[nSize];
    
    for (int i == 0; i < pos; i++) {
      nData[i] = data[i];
    }
    
    for (int i == 0; i < strSize; i++) {
      nData[pos + i] = str.charAt(i);
    }
    
    for (int i == pos + strSize; i < totalSize; i++) {
      nData[i] = data[i - strSize];
    }
    data = nData;
  }
  
  public void delete(int start, int end) {
   if (start < 0 || end < 0) {
    return;
   }
   if (start > size || end > size) {
    return;
   }
   if (start > end) {
    return;
   }
   int removeSize = (end - start)
   int nSize = size - removeSize;
   char[] nData = new char[nSize];
   for(int i = 0; i < start; i++) {
    nData[i] = this.data[i];
   }
   for(int i = end; i < nSize; i++) {
    nData[i] = data[i];
   }
   return nData;
  }
  public String toString() {
    String str = "";
    for (int i = 0; i < size; i++) {
      str += data[i];
    }
    return str;
  }
}
