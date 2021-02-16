package com.collections;

public class HashStudent implements Comparable<HashStudent>{
		private int id;
		private String name;
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public HashStudent(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public int compareTo(HashStudent o) {
			// TODO Auto-generated method stub
			if(o.id<this.id)
			{
				return -1;
			}
			else if(o.id>this.id)
			{
				return 1;
			}
			return 0;
		}

		@Override
		public int hashCode() {
			return name.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof HashStudent)
			{
				HashStudent student=(HashStudent)obj;
				if(student.getId()==this.getId()&& student.getName().equals(this.getName()))
					{
						return true;
					}
				
				
			}
			return false;
		}

		@Override
		public String toString() {
			return "HashStudent [id=" + id + ", name=" + name + "]";
		}
		
		
		
		//auto generated hashCode
//		@Override
//		public int hashCode() {
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + id;
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			return result;
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			HashStudent other = (HashStudent) obj;
//			if (id != other.id)
//				return false;
//			if (name == null) {
//				if (other.name != null)
//					return false;
//			} else if (!name.equals(other.name))
//				return false;
//			return true;
//		}

}
