/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStore extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -38592009;

	/**
	 * The singleton instance of <code>public.t_book_to_book_store</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The column <code>public.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "The book store name");

	/**
	 * The column <code>public.t_book_to_book_store.book_id</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The book ID");

	/**
	 * The column <code>public.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, this, "The number of books on stock");

	/**
	 * Create a <code>public.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore() {
		this("t_book_to_book_store", null);
	}

	/**
	 * Create an aliased <code>public.t_book_to_book_store</code> table reference
	 */
	public TBookToBookStore(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	private TBookToBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBookToBookStore(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "An m:n relation between books and book stores");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME, org.jooq.test.postgres.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore(name, null);
	}
}
